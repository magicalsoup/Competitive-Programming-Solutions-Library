Since Space Turtle is constrained to move in directions parallel to the coordinate axes, 
the closest approach of Space Turtle to the Golden Shell must be on a lattice point. The small bounds make it possible to simply simulate 
Space Turtle's movement from one lattice point to the next; every time he lands on a lattice point, check whether it's closer to the 
Golden Shell than the current best distance. However, more optimized approaches are also possible.

There are a number of approaches to simulation, some more tedious than others. 
The simplest approach is to use a coordinate system in which Space Turtle is always at the origin and facing along the positive x-axis. 
In such a coordinate system, when Space Turtle moves, the x-coordinate of the Golden Shell decreases, and when Space Turtle turns, 
we can instead imagine that the Golden Shell's position rotates around Space Turtle. For implementation details, see submission 115 by 
hansonw1. Notice that this approach makes it easy to avoid simulating each step individually; we just check the x-coordinate of the 
Golden Shell at the beginning and end of each leg of the trip. If it changes sign, then the point of closest approach is where the 
x-coordinate was zero. Otherwise, use the smaller of the two absolute values.
