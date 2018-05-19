import java.util.Scanner;
public class wc171s1{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int sa =0;
	int sb =0;
int arr[] = new int[a];
int arr2[]= new int[b];
for(int i=0;i<a;i++) {
	arr[i] = scan.nextInt();
}
for(int i=0;i<b;i++) {
	arr2[i] = scan.nextInt();
}
for(int i=0;i<a;i++) {
	boolean closer = false;
	for(int j=0;j<b;j++) {
if(arr2[j]<arr[i]) {
	closer = true;
}
	}
if(!closer) {
	sa++;
}
}

for(int i=0;i<b;i++) {
	boolean closer = false;
	for(int j=0;j<a;j++) {
if(arr[j]<arr2[i]) {
	closer = true;
}
	}
if(!closer) {
	sb++;

}
}
System.out.println(sa+" "+sb);
	}
}
