This problem admits a simple solution if we make two crucial observations. The first is that the order in which buttons is pressed is 
irrelevant; all that matters is how many times a button is pressed. The second is that pressing a button twice is the same as not pressing 
it at all, so obviously we would never want to press a button more than once. With that in mind, since there are at most 20 cells, 
there are at most 220 different sequences of moves, since for each button we have a choice of either pressing it or not pressing it. 
Thus, all we have to do is simulate every possible combination, and simply record the minimum number of button presses out of all 
combinations that succeed in turning off all lights. Given the extremely generous time limit, this is guaranteed to run in time.

For larger boards, a more efficient solution is given by light chasing. It is based on the observation that, once we have decided which 
buttons to press in the top row, we can easily deduce which buttons must be pressed in all subsequent rows. Specifically, after we have 
pressed some buttons in the top row, there may still be some lights on in the first row; if that is the case, then we must proceed by 
pressing each button immediately beneath one of the lit buttons in the top row. This is because no other buttons are capable of turning 
those lights off. Furthermore, we cannot press any button in the second row that is below an unlit button, because that would turn that 
button on, with no way to turn it back off later. Then we press all buttons in the third row that are below lit buttons in the second row, 
and so on. If we are lucky, after pressing all buttons in the last row, the last row will be completely unlit (and so will the rest of the 
board), and we have found a solution. Otherwise, we have to go back and try again with a different combination of button presses in the 
first row. But this dramatically cuts down on the amount of brute force required; for a 10 by 10 board, for example, the previous solution 
would have to examine 2100 possibilities (this is about 1030), but the light-chasing solution would only require us to test 210 
possibilities. See jargon's solution for an implementation of this technique.

This is not the final word, though. It turns out that we can almost solve this problem in polynomial time by transforming it into a linear 
algebra problem and applying Gaussian elimination. See here for a discussion of the mathematics behind this approach. This is guaranteed 
to find a solution or determine that none exists in O(n<sup>3</sup>) time, but the requirement of solving in the minimum number of moves complicates 
matters for some board sizes...
