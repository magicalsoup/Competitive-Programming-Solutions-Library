import java.util.*;
public class wordwrap {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	for(int lol=0;lol<5;lol++) {
	int a = sc.nextInt();
	sc.nextLine();
	String t = sc.nextLine();
	char[][] m = new char[t.length()/a][a];
	int count =0;
	for(int i=0;i<a;i++) {
		for(int j=0;j<t.length()/a;j++) {
			m[j][i] = t.charAt(count);
			count++;
		}
	}
	System.out.println();
	for(int i=0;i<t.length()/a;i++) {
		for(int j=0;j<a;j++) {
			if(m[i][j]==' '&&m[i][j+1]==' ')
			{
				m[i][j]='~';
			}
			else {
				break;
			}
		}
	}
	LinkedList<Character> list = new LinkedList<Character>();
	for(int i=0;i<t.length()/a;i++) {
		if(m[i][0]!=' '&&m[i][0]!='~')
			list.add(' ');
		for(int j=0;j<a;j++) {
			if(m[i][j]!='~')
				list.add(m[i][j]);
		}
	}
	for(int i=1;i<list.size();i++) {
		System.out.print(list.get(i));
	}
}
}
}
/*
jeffrey xiao's solution:
import java.util.*;
public class wordwrap{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
for(int t=0;t<5;t++){
int l = sc.nextInt();
sc.nextLine();
String s = sc.nextLine();
char[][]c = new char[s.length()/l][l];
int counter =0;
for(int y=0;y<l;y++){
for(int x=0;x<s.length()/l;x++){
c[x][y] = s.charAt(counter);
counter++;
}
}
String decode = "";
for(int x=0;x<c.length;x++){
boolean firstspace = true;
for(int y=0;y<l;y++){
if(firstspace&&c[x][y]==' '){
}
else{
firstspace = false;
decode+=c[x][y];
}
}
decode+=' ';
}
System.out.println(decode);
}
}
}
 */
