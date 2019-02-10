There's an easy way to do this problem, and a hard way. The hard way is an elementary exercise in string parsing. 
We read in the lines one at a time and split each of them into words. This is easy in C++ using stringstream, and easy in Python and 
related languagen using split, but a bit harder in Pascal, which has no native capability to parse strings in this way. 
In Pascal therefore it is necessary to manually parse the strings. We can scan character-by-character.
We keep a buffer which is initially empty. When we reach a space, we check if the buffer is empty; if not, the current contents of the 
buffer are a word, and we can either output **** (if it has four letters) or echo the word (otherwise). 
Then we empty the buffer. When we encounter a letter, we just add it to the end of the buffer.

Actually, the easy way doesn't work in Pascal anyway, but it does work in C++: 
read in words one at a time using 
```cpp
ifstream::operator>>
```
(i.e., cin). After reading each word, check 
if the next character is a line feed 
```cpp
(using getchar()).
```
That indicates the end of the test case.
