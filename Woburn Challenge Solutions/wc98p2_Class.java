import java.util.*;
public class wc98p2{

	public static void main(String[] args) {
		//read in input
		Scanner scanner = new Scanner (System.in); 
		String string;
		int t = scanner.nextInt();
		scanner.nextLine();
		while(t-->0) {
			string = scanner.nextLine();
			//split input into array
			string = string.replaceAll("-", " ");
			String[] split = string.split("\\s+");
				//generate frames
				Frame[] frame = new Frame[10];
				frame[9] = new Frame(split[9], null);
				for (int i = 8; i >= 0; i --){
					frame[i] = new Frame(split[i], frame[i+1]);
				}
				
				//generate total value
				int sum = 0;
				for(int i = 0; i < frame.length; i++){
					sum += frame[i].getScore();
				}
				System.out.println(sum);
			}
		scanner.close();
	}
}
 class Frame {
	private int[] ball;
	private boolean isFinalFrame;
	private Frame nextFrame;
	private boolean isStrike;
	private boolean isSpare;
	
	public Frame (String string, Frame myNextFrame){
		//replace - symbol with 0
		string = string.replace('-', '0');
		
		//determine if final frame
		isFinalFrame = false;
		if (string.length() == 3){
			isFinalFrame = true;
			ball = new int[3];
			assignBallValuesFinal(string);
		}
		else{
			isFinalFrame = false;
			ball = new int[2];
			//assign next frame
			nextFrame = myNextFrame;
			assignBallValuesNormal(string);
		}
	}
	
	private void assignBallValuesNormal(String string){
		//assign ball values
		if(string.charAt(0) == 'X'){
			//strike
			ball[0] = 10;
			ball[1] = 0;
			isStrike = true;
		}
		else{
			//not a strike
			ball[0] = charToInt(string.charAt(0));
			//but is it a spare?
			if(string.charAt(1) == '/'){
				isSpare = true;
				ball[1] = 10-ball[0];
			}
			else{
				//not a spare
				ball[1] = charToInt(string.charAt(1));
			}
		}
	}
	
	private void assignBallValuesFinal(String string){
		for(int i = 0; i < 3; i++){
			if(string.charAt(i) == 'X'){
				ball[i] = 10;
			}
			else if (string.charAt(i) == '-'){
				ball[i] = 0;
			}
			else if (string.charAt(i) == '/'){
				ball[i] = 10 - ball[i-1];
			}
			else{
				ball[i] = charToInt(string.charAt(i));
			}
		}
	}
	
	private int charToInt(char c){
		return Integer.parseInt(Character.toString(c));
	}
	
	public int getOneBall(){
		return ball[0];
	}
	
	public int getTwoBalls(){
		if (isStrike){
			return 10 + nextFrame.getOneBall();
		}
		return ball[0] + ball[1];
	}
	
	public int getScore(){
		int sum = 0;
		for(int i = 0; i < ball.length; i++){
			sum += ball[i];
		}
		if(!isFinalFrame){
			if(isStrike){
				sum += nextFrame.getTwoBalls();
			}
			else if(isSpare){
				sum += nextFrame.getOneBall();
			}
		}
		return sum;
	}
}

