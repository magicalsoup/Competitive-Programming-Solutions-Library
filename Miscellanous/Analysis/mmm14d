Since this problem involves long ranges of integers, it makes sense to use the decimal range decomposition so that we only have to solve 
the problem for elementary intervals. So from here on in we will simply concentrate on counting KH-numbers in an elementary interval. 
The problem before us is: if we are given a prefix (a sequence of digits) and a length (the number of digits after the prefix that need to 
be filled in), how many KH-numbers can we build from this template?

The technique for solving this problem is based on the standard dynamic programming algorithm for finding the longest increasing 
subsequence in O(N log N) time. (After all, what we need to compute is the number of numbers in a given elementary interval such that the 
digit sequence has a LIS of length at least 6.) Recall that this algorithm works by scanning the sequence from left to right and 
maintaining a list m1, m2, … where ml is the smallest element of the sequence seen so far such that there exists an increasing subsequence 
of length l. We start by setting m1 to be the first element of the sequence. Upon completion, the largest l defined is the length of the 
LIS.

Now, observe that if we just want to know whether there is an increasing sequence of length at least 6, then we only need to keep track of 
the values m1 through m5; once m6 becomes defined, we know we're done; the value of m6 itself doesn't matter, nor do the remaining 
elements in the sequence. Thus, for the problem of simply determining whether a given number is a KH-number, we can use a DP state 
consisting of the five numbers m1…5. For convenience we set mi to 10 if there is no increasing subsequence of length i yet.

Now, to any digit sequence we can associate the DP state that we would be in if we ran the LIS algorithm on that digit sequence. 
For example, for the digit sequence 1013, the corresponding DP state is m1…5 = (0, 1, 3, 10, 10) (since the minimum ending number for an 
increasing subsequence of length 1 is 0; for length 2 it is 1 (for the sequence 01), and for length 3 it is 3 
(for the sequence 113 or 013); there are no increasing subsequences of length 4 or 5. Also it's clear that if I tell you that a digit 
sequence produces a given DP state, you can determine the DP state resulting from adding a digit to the end of the sequence, 
even if I don't tell you the sequence itself. For example, given (0, 1, 3, 10, 10), you can determine by running an iteration of the DP 
that if the digit 2 is added to the end of the digit sequence, the resulting DP state will be (0, 1, 2, 10, 10), even if I don't tell you 
that the original sequence is 1013. And indeed, 10132 does yield the state (0, 1, 2, 10, 10).

These observations imply that we only care about the DP state, and don't need to keep track of the entire digit sequence.
There are less than 115 possible DP states. This suggests a meta-DP algorithm for solving the original problem. 
We start out with a set that contains only the prefix itself. For example, if the elementary interval is from 123000 to 123999, inclusive, 
then the set starts out as simply {123}. At each stage of the meta-DP, we will maintain, for each LIS DP state, a count of how many 
numbers in our set correspond to that state. Obviously, initially this is just 1 for the LIS DP state corresponding to the prefix, and 0 
for all other states. We repeatedly expand the set by replacing each number in the set by itself with the digits 0, 1, …, 9 appended. 
(So after one step, our set becomes {1230, 1231, …, 1239}; after two steps it becomes {12300, 12301, …, 12399}; and so on.) 
We will also update our count of the population of each DP state. How? Suppose the population of DP state S is P. Let S0, …, S9 be the 
states that would be obtained by appending 0, …, 9 to a digit sequence that would produce S. Then, add P to the population counts of S0…9.
(A state is counted as many times as it occurs.) This works because every digit sequence that produces S is going to yield S0 when 0 is 
appended, and so on, and we are appending 0, …, 9 to every digit sequence in our set. After this process of expanding the set has been 
carried out enough times, the set will contain all the numbers in the elementary interval. At each stage also maintain a count of
how many sequences have finished, that is, already have an increasing subsequence of length 10. This is multiplied by 10 at each stage, 
but also receives additional contributions from other states. The final value of this counter after all our iterations is the answer 
for the given elementary interval.
