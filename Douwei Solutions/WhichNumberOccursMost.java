package Douwei;

import java.util.*;
public class WhichNumberOccursMost { //mode
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr2[] = new int[n];
int count = 0;
int s = 0;
int temp = 0;
for(int i = 0; i < n; i++) {
arr2[i] = scan.nextInt();
s++;
count++;
}
int mode = 0;
int arr[] = new int[count];
for(int j = 0; j < count; j++) {
arr[j] = arr2[j];
}
Arrays.sort(arr);
int maxnumber = 1;
int size1[] = new int[count];
int rpt1[] = new int[count];
int j = 0;
size1[0] = arr[0];
rpt1[0] = 1;
for(int i = 1; i< count ; i++) {
if(arr[i] == size1[j]) {

}else {
j++;
rpt1[j] = 0;
}
size1[j] = arr[i];
rpt1[j] ++;


}
j = j + 1;
int maxrepeatnumber = rpt1[0];
for(int i = 1; i < j; i++){
if(maxrepeatnumber < rpt1[i]){
maxrepeatnumber = rpt1[i];
}
}
int samesize = 0;

for(int i = 0; i< j; i++) {
if (rpt1[i] == maxrepeatnumber) {
System.out.print(size1[i]);
}
}
for(int k = 0; k < n; k++) {
if(arr[k] == size1[0]) {
temp++;
}
}
System.out.print(" "+temp);
}
}