The official solution was a 'meet-in-the-middle' algorithm, but it turns out this is unnecessary.
All that's needed is brute force. However, N = 30, and there are 230 possibilities for a clique. We can't check them all.
However, we can optimize this approach a bit.

1. Optimization 1:
Check whether a group of people is a clique right after you add a person.
If a group of people is not a clique, it will never become one, so you might as well stop right there.
This saves a lot of time going through impossible groups.
However, there are still a lot of possible cliques, so this gets about 80/100.


2. Optimization 2:
Sometimes you can just call it quits (The technical term is 'pruning').
Keep track of the best solution you have so far.
If the possibility you're currently considering can't possibly be better, you can quit!
For example, if you know the best solution is 8, and your clique has 3 people and there's 3 more candidates, you should just stop.
This gets full points easily, and with a very fast time.
