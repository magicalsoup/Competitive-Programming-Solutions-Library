Non-polynomial Time Algorithms

You could try all N! permutations, and perform the simulation for each. Alternatively, there exist strange algorithms with time 
complexities like O(N·2<sup>N</sup>), using DP on subsets.

Greedy Algorithm

If a planet costs more fuel than it yields, then it's never optimal to visit it. Discard those planets. 
We want to visit as many of the remaining planets as possible. (An easy way to deal with the initial planet is to set its fuel cost to 0.)

We can show that the following algorithm works:

```
Visit the (undiscarded) planets in increasing order of fuel cost.
Stop when you don't have enough fuel to visit the next planet.
```
Proof of correctness: suppose that at some point, an optimal solution doesn't visit the cheapest undiscarded planet pmin, instead 
going to planet p'. Then, if we can afford to go to p', we can certainly also afford to go to pmin instead. If we do go to pmin instead, 
we won't incur a net loss of fuel (since p' wasn't discarded), so we can visit p' next. Thus, it never hurts you to visit pmin first.

This gives a solution that runs in time O(N log N): discard net-loss planets, sort the remaining ones by cost, then visit them in order until you can't anymore.
