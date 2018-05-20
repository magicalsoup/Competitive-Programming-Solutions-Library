import java.util.*;
public class ccc02s5{
    public static void main (String[] args){
	double width, height, startx, starty, x, y, a, b;
	double slope;
	int numwidth, numheight, k, bounce;
	boolean done;
	Scanner sc = new Scanner(System.in);
	width = sc.nextLong ();
	height = sc.nextLong ();
	startx = sc.nextLong ();
	starty = sc.nextLong ();
	done = false;
	slope = starty / (width - startx);
	for (k = 1 ; k <= 1000000 && !done ; k++)
	{
	    y = slope * ((k * width) - startx);
	    x = (k * height) / slope + startx;
	    numheight = (int) ((y - (height / 2)) / height) + 1;
	    numwidth = (int) ((x - (width / 2)) / width) + 1;
	    a = numheight * height;
	    b = numwidth * width;
	    if ((Math.abs (a - y) < 5) || (Math.abs (b - x) < 5))
	    {
		if (Math.abs (a - y) < 5)
		    if (a != y)
			bounce = k - 1 + (int) (y / height);
		    else
			bounce = k - 1 + (int) (y / height) - 1;
		else
		    if (b != x)
			bounce = k - 1 + (int) (x / width);
		    else
			bounce = k - 1 + (int) (x / width) - 1;
		System.out.println (bounce);
		done = true;
	    }
	}
	if (!done)
	{
	    System.out.println ("0");
	}
    }
}