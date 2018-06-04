We cannot simply generate all bit strings of length n, check which ones have k ones, sort them, and print them; the first step could 
produce more than 109 bit strings and would not complete in time (and the bit strings wouldn't fit in memory anyway). Instead, 
we tackle this problem by generating only the bit strings we want, and generating them in order.

A recursive approach turns out to be ideal. We fill in our bit string from left to right, at each step keeping track of n, 
how many more bits we need to fill in, and k, how many of these should be ones. (Initially, these values should be the ones given in the 
input.) If n=k, we just fill in the rest of the bits with ones; if k=0, we fill in the rest of the bits with zeroes. When we are done 
filling in a number, we print it out and return. If k is greater than 0 but less than n, the next bit could be either 0 or 1, but since 
we want our bit strings in descending order, we recurse on 1 (which involves adding a 1 to our bit string and decrementing both n and k by 
one) before doing so on 0 (here, only n is decremented). Don't forget that after a recursive call returns, 
the caller has to remove the bits added. This algorithm is linear in the size of the output, which is optimal.
