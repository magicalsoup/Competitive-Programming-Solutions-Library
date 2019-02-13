This is a straightforward Knapsack problem, solvable dynamically.

Keep a 2D array dyn, where dyn[A][B] is the maximum number of points achievable using exactly B hours, and some subset of the first 

A problems. A can be from 1 to N, and B can be from 1 to T, giving this solution a time complexity of O(NT)
