For each point (i, j) on the grid, try to find the largest triangle whose top vertex is at (i, j). Let's call the height of this triangle 
hi,j. For increasing h, check that we have # characters at all relevant positions in row i + h: ```{(i + h, j − h) … (i + h, j + h)}```. 
The answer is the sum of all hi,j.

To compute each hi,j, we check O(N) rows, each of which looks at O(N) grid entries. This gives us an algorithm that runs in time O(N<sup>4</sup>). 
Terminating early makes the algorithm work for large sparse cases, but this didn't help when 99.999% of the characters were #.

Improved Enumeration
We can speed up the above solution by precomputing for each position (i, j) the number of # characters to the left and right. 
More formally, let ai,j be the largest integer w for which there are # characters at all positions {(i, j − w) … (i, j + w)}. 
Then, we can do each "find largest triangle" operation with O(N) lookups to our table ai,j , for a total of O(N3).

Dynamic Programming
Notice that there are up to O(N<sup>3</sup>) triangles. So, any approach that counts the triangles one at a time cannot hope to break the O(N3) 
barrier. Let's try to count many triangles at a time.

How can you quickly compute hi,j, if you know the answer for all triangles below? If you can build a triangle of height hL from 
(i + 1, j − 1), and a triangle of height hR from (i + 1, j + 1), then:
```
    If the character at (i, j) isn't #, then hi,j = 0.
    If the character at (i, j) is #, but the character at (i + 1, j) isn't, then hi,j = 1.
    Otherwise, hi,j = 1 + min(hL, hR).
``` 
We can build this table from the bottom up, in time O(N2).
