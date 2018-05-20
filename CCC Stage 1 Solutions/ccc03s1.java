import java.util.Scanner;

public class ccc03s1{
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int arr[] =new int[100000];
	int temp = 0;
	
	for(int i=0;i<100000;i++) {
		arr[i]= scan.nextInt();
	
		 if(arr[i] ==0||arr[i]<2||arr[i]>12) {
			System.out.println("You Quit!");
			System.exit(0);
		}
		
		if(i==0) {
		    temp = arr[i] + 1;
		    if(arr[i]==8) {
		    	//System.out.println("You are now on square 34");
		    	temp=34;
		    	
		    }
			//System.out.println("You are now on square "+temp);
		}else { 
			temp = temp + arr[i];
			if (temp == 100 ) {
				System.out.println("You are now on square " + temp);
				System.out.println("You Win!");
				System.exit(0);
			} else if(temp==54) {
				//System.out.println("You are now on square 19");
				temp =19;
			}else if(temp==90) {
					//System.out.println("You are now on square 48");
					temp= 48;
			}else if(temp==99) {
					//System.out.println("You are now on square 77");
					temp = 77;
			}else if(temp==9) {
					//System.out.println("You are now on square 34");
					temp =34;
			}else if(temp==40) { 
					//System.out.println("You are now on square 64");
					temp = 64;
			}else if(temp==67) {
					//System.out.println("You are now on square 86");
					temp = 86;
			}else if(temp>100) {
				temp = temp - arr[i];
				//System.out.println("You are now on square "+temp);
			}else 
				temp = temp;
				//System.out.println("You are now on square "+temp);
		    }//end of temp if
		    System.out.println("You are now on square "+temp);
	}//end of for
	}//end of main
		
}//end of clas