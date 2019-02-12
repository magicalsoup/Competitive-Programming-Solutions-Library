The key observation here is that if there are duplicates in the second or third row, then one of the numbers present 

in the first row will not be present there.

For example, in
```
5 4 3 2 1 6 7
5 5 1 1 3 4 7
3 7 1 4 5 6 2
```
there are no 6s nor 2s in the second row.

Now, this means that ALL columns with a 6 or a 2 have to be deleted, no matter what.

So after doing so:
```
5 4 3 1
5 5 1 3
3 7 1 5
```
There is no 4 in the second row or third row, so likewise all 4s have to be deleted:
```
5 3 1
5 1 3
3 1 5
```
and finally everything is satisfied.

Implementing this is not tricky, but a simple approach may prove to be too slow.

One could try looping over the array several times until everything is OK, but this might take O(N<sup>2</sup>) time (or worse)

We need to find a way to do this is O(N) time.

To do this, we'll keep track of which columns need to be deleted with a queue (or stack, it doesn't matter)

So, for this example the 2s and 6s need to be deleted, so the 4th, 6th, and 7th columns are 'queued'.

Now we repeatedly take a column from the queue and process it.

To "delete" a column efficiently, we can keep track of the count of numbers for each row.

e.g. There are two 1s, one 3, one 4, two 5s, and one 7 in the second row.

When the 4th column is deleted the count of 1s is decreased by one.

So how do we find new columns that need to be deleted?

Well, when the count of a certain number in a row reaches 0, then all columns containing that number must be deleted.

To do this we can keep track of the locations of all occurences of a certain number.

(You don't need to update this list; if you consider something that's already been deleted it makes no difference)

Of course, we have to make sure that no column is flagged for deletion twice, as this would be quite inefficient.

Code:
```cpp
#include <iostream>
#include <vector>
#include <queue>
using namespace std;

int arr[3][100011]; //numbers
int cnt[3][100011]; //count of number for each row
vector<int> loc[100011]; //all columns where a number occurs

queue<int> queued;
bool flagged[100111]; //you can only delete a column once!
void remove(int number) //remove all occurences of a number
{
	for (int i = 0; i < loc[number].size(); i++)
		if (!flagged[loc[number][i]]) {
			flagged[loc[number][i]] = true;
			queued.push(loc[number][i]);
		}
}

int main()
{
	int N; scanf("%d", &N); //cin is pretty slow
	for (int i = 0; i < 3; i++)
		for (int j = 0; j < N; j++)
		{
			scanf("%d", &arr[i][j]);
			cnt[i][arr[i][j]]++; //global variables are auto-initialised to 0
			loc[arr[i][j]].push_back(j);
		}
	
	for (int i = 1; i <= N; i++)
		if (!cnt[0][i] || !cnt[1][i] || !cnt[2][i]) //missing from a row
			remove(i);
	
	while (queued.size())
	{
		int rem = queued.front();
		queued.pop();
		for (int i = 0; i < 3; i++)
			if (!--cnt[i][arr[i][rem]]) //becomes missing?
				remove(arr[i][rem]);
	}
	
	int removed = 0;
	for (int i = 0; i < N; i++)
		removed += flagged[i];
	printf("%d\n", removed);
	
	return 0;
}
```
