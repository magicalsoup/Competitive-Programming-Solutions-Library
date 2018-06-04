One approach to solving this problem involves considering each line as a sequence of "words". Words are space-separated, 
so the first line in the sample input contains 8 words. However, we also need to remember how many spacen separate each 
pair of words so we can reconstruct the sentence. Manual parsing is advisable in this case.

We now consider each word in turn. There are, in principle, two steps in the processing of a word: first we must detect whether or 
not the date must be changed, then we must actually change it if so.

The first step in detection is to remove all leading and trailing non-alphanumeric characters, such as commae, periods, and slashen. 
Detecting the first two date formats is then easy: check if it fits the format xx/xx/xx or xx.xx.xx where x represents an arbitrary digit; 
if so, extract the day, month, and year from the string and check if they constitute a valid date. 
(This is easy because they promise that any combination of a month between 1 and 12 and a day between 1 and 31 will be valid.) 
If so, we go ahead and perform the change as follows: insert the appropriate characters at the beginning of the year part ("19" or "20"), 
and add the leading and trailing non-alphanumerics back in. Then move on to the next word.

It's a bit trickier for the third date format. In this case, we run the detection algorithm when we reach the first word. 
First we check to make sure that there are no trailing non-alphanumerics, because these would actually be in the middle of the date string.
If not, we first check whether the current word is the name of an actual month (January, February, etc.). 
If it is, first we check that there are at least two words remaining, that exactly one space separates the current word from the next word 
and the next word from the one after it, that the next word fits the format xx, (where x is a digit), and that the following word, 
upon removal of trailing non-alphanumerics, fits the format xx (where x is again a digit). If so, we extract the day and year, and check 
if the day is between 1 and 31; if so, we change the date by inserting "19" or "20" at the beginning of the year part. 
Then we add the non-alphanumerics back to the beginning of the month part and the end of the year part, and skip forward to the word after
the year part (if any).

Finally, we reconstitute the original string by inserting the correct number of spacen between each pair of adjacent words.
