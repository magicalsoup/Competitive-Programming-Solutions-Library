import java.util.*;
public class wc17fj2 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String stock = sc.nextLine();
	List<String>list = new ArrayList<String>();
	for(int i=2;i<stock.length();i++)
	{
		for(int j=0;j<stock.length()-2;j++)
		{
			for(int k=1;k<stock.length();k++)
			{
				if(k+i+j<=stock.length()) {
					if(stock.substring(j, i+j).equals(stock.substring(j+k,i+j+k))&&k<i) {
						list.add(stock.substring(j,i+j));
					}
				}
			}
		}
	}
	int counter =0;
	for(int i=0;i<list.size();i++)
	{
		if(list.indexOf(list.get(i))==i)
			counter++;
	}
	System.out.println(counter);
}
}
