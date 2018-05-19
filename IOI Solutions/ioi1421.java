import java.io.*;
import java.util.*;
public class ioi1421{
static long MOD = 1000000009;
public static void main (String[]args)throws IOException{
	BufferedReader bf = new BufferedReader(new  InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(bf.readLine());
	int T = Integer.parseInt(st.nextToken());
	st = new StringTokenizer(bf.readLine());
	int n = Integer.parseInt(st.nextToken());
	int gondola[] = new int[n];
	st = new StringTokenizer(bf.readLine());
	if(4<=T&&T<=6) {
		int iFirst = 0;
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		for(int i=0;i<n;i++) {
			gondola[i] = Integer.parseInt(st.nextToken());
			if(gondola[i]<=n) {
				iFirst = (i+1-gondola[i]+n)%n;
			}
			if(gondola[i]>n) {
				  Pair p = new Pair( gondola[i],i);
				pq.add(p);
			}
		}
	int val[] = new int[n];
	int s =2;
	val[iFirst] = 1;
	for(int i = (iFirst+1)%n;i!=iFirst;i=(i+1)%n) {
		val[i] = s;
		s++;
	}
	Queue<Integer> result = new LinkedList<Integer>();
	int act = n+1;
	while(!pq.isEmpty()) {
		Pair pp  = pq.poll();
		while(val[pp.i] !=pp.a) {
			result.add(val[pp.i]);
			val[pp.i] = act;
			act++;
		}
	}
	System.out.print(result.size());
	for( Integer ee:result) {
		System.out.print(" "+ee);
	}
	System.out.println("");
	}else if(T>=7){
		int minI =0;
		int min = Integer.MAX_VALUE;
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			gondola[i] = Integer.parseInt(st.nextToken());
			if(gondola[i]<min) {
				minI = i;
				min = gondola[i];
			}
			if(hs.contains(gondola[i])) {
				System.out.println(0);
				return;
			}
			hs.add(gondola[i]);
	}
		int lastValid = -1;
		int off = 1;
		boolean b = false;
		for(int i=0;i<n;i++) {
			int e = gondola[(i+minI)%n];
			if(lastValid==-1&&e<=n) lastValid = e;
			else if(e>n) {b = true; off++;}
			else if(lastValid +off !=e) {
				System.out.println(0);
				return;
			}
			else {
				lastValid = e;
				off =1;
		}
		}
		if(b) {
			long res = 1;
			boolean perm =  true;
			int sup =0;
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for(int i=0;i<n;i++) {
				if(gondola[i]<=n) {
					perm = false;
				}
				else {
					pq.add(gondola[i]);
					sup++;
				}
		}
			if(perm) {
				res*=n;
			}
			long act =n;
			while(!pq.isEmpty()) {
				long w = pq.poll();
				long e =w - act-1;
				res = res*fastPowMod(sup,e)%MOD;
				sup--;
				act = w;
			}
			System.out.println(res);
	}
		else {
			System.out.println(1);
		}
}
	else {
		int minI =0;
		int min = Integer.MAX_VALUE;
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			gondola[i] = Integer.parseInt(st.nextToken());
			if(gondola[i]<min) {
				minI =i;
				min = gondola[i];
			}
			if(hs.contains(gondola[i])) {
				System.out.println(0);
				return;
			}
			hs.add(gondola[i]);
		}
		int lastValid = -1;
		int off =1;
		for(int i=0;i<n;i++) {
			int e =gondola[(i+minI)%n];
			if(lastValid==-1&&e<=n) lastValid = e;
			else if(e>n) {off++;}
			else if(lastValid+off!=e) {
				System.out.println(0);
				return;
			}else {
				lastValid = e;
				off =1;
			}
		}
		System.out.println(1);
	}
}
static long fastPowMod(long a,long e) {
	if(e==0) return 1;
	else {
		long s = fastPowMod(a,e/2);
		s = (s*s)%MOD;
		if(e%2==1) {
			s = (s*a)%MOD;
		}
		return s;
	}
}
}
 class Pair implements Comparable<Pair>{
 int a,i;
 public Pair(int aa,int ii) {
 a= aa;
 i = ii;
 }
 @Override
 public int compareTo(Pair o) {
	 return Integer.compare(a, o.a);
 }
}
