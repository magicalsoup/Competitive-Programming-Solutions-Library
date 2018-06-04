This problem is rather annoying. The first step is to simply calculate where the rover ends up and which direction it's facing. 
This is the easy part: we just simulate its motion. We might store the direction as an integer from 0 to 3 for instance, 
keeping the dx and dy values in arrays, and then implementing the turn commands as incrementing or decrementing the direction mod 4. 
It's getting back that's the really annoying part, because we have to minimize the number of commands we issue. We solve this using a 
case bash. If we're back at our starting point, we don't have to do anything at all. If we're directly above, below, left, or right of 
our starting location, we first have to turn so that we're facing the starting location and then issue one move command. 
If we're already facing this direction, we don't have to turn. If we're facing opposite this direction, we have to issue two turn 
commands of the same kind (doesn't matter which). If we're facing in some other direction, we have to issue one turn command 
(of the correct type). Otherwise, we need two move commands. If we start out facing one of the directions we have to move, 
we move in this direction first, then issue one turn command and move in the other direction; otherwise, we select which of the 
two directions we have to move in is "closer" to our current direction, turn that way, and move that way first, before turning again and 
moving along the other direction. The code for this can become very ugly though if not written cleverly
