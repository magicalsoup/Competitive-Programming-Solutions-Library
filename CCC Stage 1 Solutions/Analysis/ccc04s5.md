This is a dynamic programming problem based on considering one column at a time, from left to right. For each square, 
we want to compute the maximum score SP can get after he lands on this square, assuming that he will not make any more moves in the same 
column afterward. Notice that this only depends on the maximum scores for the previous column (to the left); it doesn't depend at all on 
what SP did before he got to the previous column.

Thus, we proceed from left to right. Each time we reach a column, we compute the maximum score for all squares in that column, using the 
values computed for the previous column. The base case of the leftmost column is easy: for each square, check if there is a vertical path 
from the bottom-left corner to this square, and if so, add up all the coins along the way. For all subsequent columns, for each square in 
the column, try every possible square in the previous column as the last square visited in the previous column before entering the current 
column. If the previous square is above the current square, there is only one path: move to the right then move down repeatedly. 
If the previous square is below the current square, the only possible path is to move to the right then up repeatedly. 
If the previous square is immediately to the left of the current square, the only possible path is to just move to the right. 
In each case we can check whether this path is valid, and, if so, add the coins on that path to the maximum score for the square 
we came from. The best score thus obtained is the maximum score for the current square. The output is the maximum score for TP's square, 
in the bottom-right
