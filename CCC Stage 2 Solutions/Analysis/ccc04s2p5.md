
This problem is more logic than anything.

"Note that a structure will topple if its center of gravity, projected onto its base, lies outside the convex hull of its support points. 
If the center of gravity lies on the edge of this hull, we will assume the structure is stable."

This paragraph, although true, is also quite irrelevant and misleading.

There are a few main ideas we need to grasp in order to easily solve this problem:

1. The tower will NEVER fall after placing a piece because of the rule that states a new level can only be formed when the top level is 
completed.

2. We only care about the current level, nothing above or below it because if that level was going to fall, it would have fallen already.

3. If a level has a middle piece it will not fall. If it does not have a middle piece, it must have both outer pieces.

With these three ideas, we can follow the given removals/insertions of blocks and check each time a piece is removed, whether that level 
is stable or not (remember we do not care about insertions, but we still need to record where the block is placed on the top level).

Keep a 2D-boolean array holding the occupied spaces in the tower, setting the first 18 levels as full (true) and changing elements to 
false when blocks are removed, and break when we find an unstable level.
