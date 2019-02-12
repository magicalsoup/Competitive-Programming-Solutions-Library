The simplest algorithm to test for primality is trial division, which runs in O(√N). The square root of 2<sup>63</sup> is about 3 billion, so this
method will clearly TLE. Many probabilistic algorithms exist for testing primes with extremely high accuracy rates. 
Algorithms such as the Fermat primality test, Solovay-Strassen primality test, the Baillie-PSW primality test, 
and the Miller-Rabin primality test are all very well-known and easily researchable.


I recommend using the Miller-Rabin test, as it is fast, accurate, and relatively easy to implement.
It is widely used by standard libraries of many languages, including Mathematica's [PrimeQ](https://reference.wolfram.com/legacy/v5_2/Add-onsLinks/StandardPackages/NumberTheory/PrimeQ.html) function, 
Java's [BigInteger.isProbablePrime()](http://developer.classpath.org/doc/java/math/BigInteger-source.html) method, and the [mpz_probab_prime_p()](https://gmplib.org/manual/Number-Theoretic-Functions.html#Number-Theoretic-Functions) function in GMP. Using modular exponentiation by repeated 
squaring, the algorithm runs in O(k log<sup>3</sup>N), where k is the number of iterations performed. The Miller-Rabin test is always correct in 
determining whether a prime number is prime, however if the number is composite, the probability of it incorrectly returning prime is 
(1/4)k. Thus, for k = 20, the probability of failure is 0.2520 ≈ 9.1×10<sup>−13</sup> (one in a trillion), and is extremely low. 
The running time is therefore 20*log<sup>3</sup>(2<sup>63</sup>−1)) ≈ 1.6 million. In practice, the program is much faster and should definitely run in 
2 seconds if we are only required to test 100 numbers. If this is still not fast enough, note that even performing as few as k = 10 
iterations should be accurate enough 
(1 in 1 048 576 chance of error, and we only have at most 500 numbers to test across the 5 test cases).

The problem with the Miller-Rabin test is that it requires modular exponentiation, which will certainly cause 64-bit integers to overflow 
if implemented carelessly. Initially, one may be tempted to code bignums or use two 64-bit integers to store intermediate values, 
but this is actually unnecessary. Since we're performing modular exponentiation by squaring (i.e. multiplication), 
why not perform the squaring operations using modular multiplication by doubling to prevent overflow? 
The input is only limited to 64-bit signed integers, however if we double the maximum value for a 64-bit signed integer (2<sup>63</sup>−1), 
we still would not overflow a 64-bit unsigned integer (which has maximum value 2<sup>64</sup>−1)! Thus, by storing every value in an 
unsigned long long (C/C++) or a Qword (Pascal), we may successfully use the Miller-Rabin test for all 64-bit signed values 
while avoiding overflow.
