import java.util.Scanner;
public class wc173j4 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
int r = scan.nextInt();
int c = scan.nextInt();
scan.nextLine();
String arr[] = new String[r];
for(int i = 0; i < r; i++) {
arr[i] = scan.nextLine();
}
String t = scan.nextLine();
String b = scan.nextLine();


int space1 = 0;
int space2 = 0;
space1 = c - t.length();
space2 = c - b.length();
space1 = (int)space1/2;
space2 = (int)space2/2;
int olo = 0;
char arr3[] = new char[t.length()+1];
for(int i = space1; i < t.length()+space1+1;i++,olo++) {
char ch3 = arr[1].charAt(i);
arr3[olo] = ch3;
}
olo= 0;
char arr4[] = new char[b.length()+1];
for(int i = space2; i < b.length()+space2+1;i++,olo++) {
char ch3 = arr[r-2].charAt(i);
arr4[olo] = ch3;
}


for(int i = 0; i < r; i++) {
if(i == 1) {
for(int j = 0; j < arr[i].length();j++){
char ch = arr[i].charAt(j);
if(j==space1) {
for(int k = 0; k < t.length(); k++) {
char ch2 = t.charAt(k);
if(ch2 == '_') {
System.out.print(arr3[k]);
}
else {
System.out.print(ch2);
}
}
j = j + t.length()-1;
}
else {
System.out.print(ch);
}
}
i++;
System.out.println();
}//FIRST ONE
if(i == r-2) {
for(int j = 0; j < arr[i].length();j++){
char ch = arr[i].charAt(j);
if(j==space2) {
for(int k = 0; k < b.length(); k++) {
char ch2 = b.charAt(k);
if(ch2 == '_') {
System.out.print(arr4[k]);
}
else {
System.out.print(ch2);
}
}
j = j + b.length()-1;
}
else {
System.out.print(ch);
}
}
System.out.println();
}
else {
System.out.println(arr[i]);
}
}//end of for
}
}
