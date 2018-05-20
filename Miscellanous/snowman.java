import java.util.*;
public class snowman {
	static  int t = 5;
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	while(t-->0) {
		int n = sc.nextInt();
		int padding = Math.max(0,(n*(n+1)/2-5));
			print (padding,"         |\n");
		    print (padding,"      \\  |  /\n");
		    print (padding,"       \\ | /\n");
		    print (padding,"        \\|/\n");
		    print (padding,"       XXXXXXX\n");
		    print (padding,"      X       X\n");
		    print (padding,"     X  O   O  X\n");
		    print (padding,"    X     V     X\n");
		    print (padding,"W   X  X     X  X\n");
		    print (padding," \\   X  XXXXX  X\n");
		    print (padding,"  \\   X       X\n");
		    print (padding,"   \\   XXXXXXX\n");
		    print (padding,"    \\ X       X---\n" );
		    print (padding,"     X    O    X  \\\n" );
		    print (padding,"    X           X  \\\n" );
		    print (padding,"     XXXXXXXXXXX    \\\n" );
	
	if(n==1)
	{
		print(padding,"      OOOO OOOO      M\n");
		print(padding,"      OOOO OOOO\n");
	}
	else {
		print(padding,"     X         X     M\n");
		print(padding,"    X     O     X\n");
		print(padding,"   X      O      X\n");
		print(padding,"  X               X\n");
		print(padding,"   XXXXXXXXXXXXXXX\n");
	
		for(int i=3,mid = 13,p = padding;i<=n;i++,p-=i,mid-=2) {
			p+=i;
			print(p,"X");
			print(mid,"X\n");
			p--;
			mid+=2;
			for(int j=0;j<i;j++,p--,mid+=2)
			{
				print(p,"X");
				print(mid/2,"O");
				print(mid/2,"X\n");
			}
			print(p,"X");
			print(mid,"X\n");
			print(++p,"");
			for(int j=0;j<mid;j++)
				System.out.print("X");
			System.out.println();
		}
		print(padding,"      OOOO OOOO\n");
			print(padding,"      OOOO OOOO\n");
	}
	System.out.println();
	}
}
static void print(int pad,String s)
{
	for(int i=0;i<pad;i++)
		System.out.print(" ");
	System.out.print(s);
}
}
