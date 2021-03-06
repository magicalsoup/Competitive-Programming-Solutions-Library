There are, in principle, two different ways to approach this problem. One is to take your chances with time and date functions provided by

your language's standard library. The other, of course, is to perform the conversion manually. 

(There is actually no function in the C standard that completely subsumes the task given in this problem, and since C++ did not add any 

new time and date functions, C++ users are also out of luck.)

Luckily, the required arithmetic manipulations are not difficult. We begin by determining the year. This is done by counting down from the

input value, as though we were making change. The year 1904 was a leap year, so as long as the input is less than 366, the date falls 

within the first year. If not, we subtract 366, and then try to figure out whether the date falls within 1905. 1905 was a common year, 

so as long as our current number is less than 365, the date falls within 1905; if not, then we subtract 365, and so on. Once we've figured 

out the year, we count down by months; first we compare the number to 31, the number of days in January, and if it's less, then we stop,

but if it's more, then we subtract 31 and proceed to February (at which point we have to be careful, as February may have a leap day), and

so on. The integer part of whatever we're left with is one less than the day. (Think about it carefully: a number less than one, 

for example, represents some time during the first of the month.) We scale the decimal part by 86400, the number of seconds in a day. 

Dividing by 3600 gives the hour; dividing the remainder by 60 gives the minute, and whatever is left is the second.
