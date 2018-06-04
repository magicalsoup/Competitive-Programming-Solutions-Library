A straightforward solution is to first generate all primes up to B using the sieve of Eratosthenes. 
Then, loop from A to B, and for each number, count the number of primes that it is divisible by. If we let N = B − A and P = 
the number of primes under N, then complexity of this solution is O(N log log N + PN) = O(PN). However, there are 78498 primes less than 
1000000 so the second part of this solution will clearly not run in time.

The problem can be solved efficiently from making an observation about the sieve of Eratosthenes itself. To generate primes normally with 
the sieve, we repeatedly find the next available prime number and mark off its multiples as composite. The sieve itself lets us know 
whether numbers are composite when we encounter a prime number which has it as a multiple (and hence is its factor). By simply changing
the boolean array in the normal sieve into an array of counters, every time we make a pass using a prime, we can increment the counter 
array at that index, marking off an extra prime factor of the multiple. Since we only make one pass for each prime number, we can be sure 
that the counter array only counts distinct primes.

The only difference to be careful of is that we should start the inner loop at the prime itself, and not double the prime 
(as we would in a normal sieve to save speed). The resulting running time should be around the same as just running a normal sieve.
