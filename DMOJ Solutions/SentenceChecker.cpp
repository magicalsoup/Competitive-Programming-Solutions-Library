#include <bits/stdc++.h>
#include<iostream>
using namespace std;
int n, t = 100000; string s, dictionary;
int main()
{
   cin >> n;
   while(n--){
      cin >> s;
      dictionary += s + " ";
   }
   while(t--){
       string str; cin >> str;
       if(dictionary.find(str) == std::string::npos){
           cout<< "Incorrect"; return 0;
       }
   }
   cout<<"Correct";
   return 0;
}
