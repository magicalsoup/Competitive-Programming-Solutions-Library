The easiest way to tackle this problem is probably the "double sieve". 
The algorithm consists of two parts. In the first, 

we use the Sieve of Eratosthenes to compute all primes from 2 up to the &radic;M. This is at most a bit more than 30000,
so it will easily run in time. In the second, using the primes we computed from the first step, we sieve out only the composite numbers in 
the range [N,M] (All composite numbers in that range are guaranteed to have a prime factor less than or equal to &radic;M
Then we just print all the primes that remain.
