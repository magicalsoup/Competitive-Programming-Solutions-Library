There are two steps to constructing each line. First, we figure out how many words we can fit on the line. 
Then, we figure out where to place the spaces (periods), and print out the line. For the first step, we note that printing n words 
requires n-1 extra characters in addition to the sum of the lengths of the words themselves (the extra characters are, of course, for 
spaces). With this in mind, we simply scan forward to find the last word that we can place on the current line. 
If we can only place one word on the line, then we print it out and pad the line with spaces. Otherwise, we figure out how to distribute 
the spaces. If we print n words, and there are s characters left for space (that is, s plus the total length of the words equals w), 
then the first s mod (n-1) gaps between words should each consist of ⌈s/(n-1)⌉ spaces each, and the remaining gaps should consist of one 
fewer space each.
