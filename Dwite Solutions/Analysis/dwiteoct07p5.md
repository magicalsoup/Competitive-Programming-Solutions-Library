The author finds that the easiest way to solve this problem is to first compute the paths that the human and velociraptor would each take 

to the exit if they were in the maze alone, and then actually simulate their traversal along this path until either the velociraptor 

catches the human or the human escapes.

First, we have to figure out the coordinates of the exit and the initial positions of the human and velociraptor. 

This is trivial, of course.

To find the path, we use DFS. The problem statement guarantees that there is exactly one possible path in each case. To actually return 

the path itself, we push each vertex we visit onto a stack (which mirrors the activity of the search itself) but pop it off it turns out 

not to lead to a successful path. On success, the stack will contain a correct path.

The simulation can be a bit tricky. We imagine that at each time step, first the human and the velociraptor both take one step 

(if the velociraptor has not already reached the exit), and then check for collision. Then we advance the velociraptor again, 

unless it has reached the exit, and check for collision; and finally, if, at the end of the time step, the human is at the exit, then the 
escape was successful.
