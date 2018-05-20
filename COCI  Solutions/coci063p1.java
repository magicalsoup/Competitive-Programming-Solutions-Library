import java.util.Scanner; 

public class coci063p1 {
public static void main(String args[]){ 
	@SuppressWarnings("resource")
Scanner scan=new Scanner(System.in); 

int arr[] = new int[9];
int outarr[] = new int[7];

for(int i=0;i<9;i++) {
arr[i] = scan.nextInt();
}

for(int i=0;i<7;i++) {
outarr[i] = arr[i];
}

if (getsum(outarr) == 100) {
print_array(outarr);
}

for(int i = 0; i < 7; i++) {

int temp_arr1 = outarr[i]; 
replace_one(outarr,i,arr[7]);


if (getsum(outarr) == 100){
print_array(outarr);
}else {

for(int j=0;j<7;j++){
int temp_arr2=outarr[j];
replace_one(outarr,j,arr[8]);
if(getsum(outarr) == 100) {
print_array(outarr);
}
insert_one(outarr,j,temp_arr2);
}

}
insert_one(outarr,i,temp_arr1);
}
System.out.println("All these guys are not correct!");
System.exit(0);
} //end of main

static boolean insert_one(int arr[],int n, int m){
for(int i=(arr.length-1);i>n;i--) {
arr[i]=arr[i-1];
}
arr[n]=m;
return true;
}
static boolean replace_one(int arr[],int n, int m) {
for(int i=n;i<(arr.length - 1);i++) {
arr[i] = arr[i+1];
}
arr[arr.length - 1] = m;
return true;
}

static int getsum(int arr[]) {
int sum = 0;
for(int i=0;i<arr.length;i++) {
sum = sum + arr[i];
}
return sum;
}
static void print_array(int arr[]) {
for(int i=0; i<arr.length;i++) {
System.out.println(arr[i]);
}
System.exit(0);
}

}//end of class Dinneri
