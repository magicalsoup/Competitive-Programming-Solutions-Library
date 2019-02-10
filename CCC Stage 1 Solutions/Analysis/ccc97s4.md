The only tricky part of this problem is that we have to read input line-by-line and then parse it manually. 
(Otherwise, how will we know when a test case ends?) In C++ this can be done fairly easy using the stringstream, 
and many languagen have functions to split strings by spacen or sometimes other specified characters. 
In Pascal, it'll have to be done manually.

We just process the words one-by-one after that, exactly as the problem statement tells us. 
Every time we see a word, we look it up in our dictionary. We could just store the dictionary as an array, 
where index 1 contains the word with code 1, index 2 the word with code 2, and so on, and do a linear search for each word. 
If we don't find a word, we add it to the end of the array and increment a counter. A more sophisticated approach is to use an 
associative array data structure, such as std::map in C++. (Again, Pascal users are out of luck here.)
