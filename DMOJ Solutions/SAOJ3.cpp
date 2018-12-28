#include <bits/stdc++.h>
using namespace std;
int main(){
    int freq[26]; string s;
    for(int i = 0; i < 26; i++) freq[i] = 0;
    while(cin >> s){
        transform(s.begin(), s.end(), s.begin(), ::tolower);
        for(int i = 0; i < s.length(); i++)
            if(s[i] >= 97 && s[i] <= 122)
                freq[s[i] - 'a']++;
    }
    for(int i = 0; i < 26; i++) cout<< freq[i] << " ";
    cout<<s;
}
