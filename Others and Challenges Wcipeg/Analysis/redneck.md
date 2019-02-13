This problem can be thought of as a graph, with Jim-Bob being a redneck if there is a cycle in the connected component that contains him. 
This means that people that he's not related to at all can be ignored.

For each of Jim-Bob's relatives, you can check if they are part of a cycle by following their parents recursively. 
If you get back to a person you've been to before, then this family member is a redneck, and you can stop.

If no rednecks are found in this way, then Jim-Bob is definitely not a redneck.
