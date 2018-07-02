import java.util.*;
 import java.io.*;
    public class ioi1412{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt();
    	  int k = readInt();
    	  SegmentTree tree = new SegmentTree(n);
    	  while(k-->0) {
    		int val = readInt();
    		int left = readInt();
    		int right = readInt();
    		int num = readInt();
    		if(val==1) {
    			tree.raise(left, right, num);
    		}
    		else {
    			tree.lower(left, right, num);
    		}
    	  }
    	  for(int i=0;i<n;i++) {
    		  pw.println(tree.query(i));
    	  }
    	  pw.close();
      }
      static class SegmentTree{
    	  public State[] lazy;
    	  public int size;
    	  public void debug() {
    		  debug(1,0,size-1);
    	  }
    	  public void debug(int lazyIndex,int left,int right) {
    		  if(lazy[lazyIndex]!=null) {
    			  pw.println(left+" "+right+": "+lazy[lazyIndex]);
    		  }
    		  if(left==right) return;
    		  int mid = (left+right)/2;
    		  debug(2*lazyIndex,left,mid);
    		  debug(2*lazyIndex+1,mid+1,right);
    	  }
    	  public SegmentTree(int n) {
    		  size = n;
    		  lazy = new State[4*n];
    		  lazy[1] = new Force(0);
    	  }
    	  public void pushLazy(int lazyIndex) {
    		  if(lazy[lazyIndex]==null)return;
    		  lazy[2*lazyIndex] = genNext(lazy[lazyIndex],lazy[2*lazyIndex]);
    		  lazy[2*lazyIndex+1] = genNext(lazy[lazyIndex],lazy[2*lazyIndex+1]);
    		  lazy[lazyIndex] = null;
    	  }
    	  public void raise(int left,int right,int val) {
    		  raise(1,0,size-1,left,right,val);
    	  }
    	  public void raise(int lazyIndex,int treeLeft,int treeRight,int left,int right,int val) {
    		  if(left>treeRight||right<treeLeft)return;
    		  if(treeLeft>=left&&treeRight<=right) {
    			  lazy[lazyIndex] = genNext(new Raise(val),lazy[lazyIndex]);
    		  }
    		  else {
    			  pushLazy(lazyIndex);
    			  int treeMid = (treeLeft+treeRight)/2;
    			  raise(2*lazyIndex,treeLeft,treeMid,left,right,val);
    			  raise(2*lazyIndex+1,treeMid+1,treeRight,left,right,val);
    		  }
    	  }
    	  public void lower(int left,int right,int val) {
    		  lower(1,0,size-1,left,right,val);
    	  }
    	  public void lower(int lazyIndex,int treeLeft,int treeRight,int left,int right,int val) {
    		  if(left>treeRight||right<treeLeft) return;
    		  if(treeLeft>=left&&treeRight<=right) {
    			  lazy[lazyIndex] = genNext(new Lower(val),lazy[lazyIndex]);
    		  }
    		  else {
    			  pushLazy(lazyIndex);
    			  int treeMid = (treeLeft+treeRight)/2;
    			  lower(2*lazyIndex,treeLeft,treeMid,left,right,val);
    			  lower(2*lazyIndex+1,treeMid+1,treeRight,left,right,val);
    		  }
    	  }
    	  public int query(int index) {
    		  return query(1,0,size-1,index);
    	  }
    	  public int query(int lazyIndex,int left,int right,int index) {
    		  if(index>right||index<left)return -1;
    		  if(left==right) {
    			  Force f = (Force)lazy[lazyIndex];
    			  return f.k;
    		  }
    		  pushLazy(lazyIndex);
    		  int mid = (left+right)/2;
    		  return Math.max(query(2*lazyIndex,left,mid,index),query(2*lazyIndex+1,mid+1,right,index));
    	  }
      }
      public static State genNext(State parent,State child) {
    	  if(parent==null) throw new RuntimeException("ILLEGAL");
    	  if(child==null)return parent;
    	  if(parent instanceof Force) {
    		  return parent;
    	  }
    	  if(parent instanceof Raise) {
    		  Raise raise = (Raise)parent;
    		  if(child instanceof Force) {
    			  Force force = (Force)child;
    			  return new Force(Math.max(force.k, raise.k));
    		  }
    		  if(child instanceof Raise) {
    			  Raise raise2 = (Raise)child;
    			  return new Raise(Math.max(raise.k, raise2.k));
    		  }
    		  if(child instanceof Lower) {
    			  Lower lower = (Lower)child;
    			  if(lower.k<=raise.k) {
    				  return new Force(raise.k);
    			  }
    			  else {
    				  return new Both(raise.k,lower.k);
    			  }
    		  }
    		  if(child instanceof Both) {
    			  Both both = (Both)child;
    			  if(both.floor<=raise.k) {
    				  return new Force(raise.k);
    			  }
    			  return new Both(Math.max(raise.k, both.raise),both.floor);
    		  }
    	  }
    	  if(parent instanceof Lower) {
    		  Lower lower = (Lower)parent;
    		  if(child instanceof Force) {
    			  Force force = (Force)child;
    			  return new Force(Math.min(force.k, lower.k));
    		  }
    		  if(child instanceof Lower) {
    			  Lower lower2 = (Lower)child;
    			  return new Lower(Math.min(lower.k, lower2.k));
    		  }
    		  if(child instanceof Raise) {
    			  Raise raise = (Raise)child;
    			  if(lower.k<=raise.k) {
    				  return new Force(lower.k);
    			  }
    			  else {
    				  return new Both(raise.k,lower.k);
    			  }
    		  }
    		  if(child instanceof Both) {
    			  Both both = (Both)child;
    			  if(lower.k<=both.raise) {
    				  return new Force(lower.k);
    			  }
    			  return new Both(both.raise,Math.min(both.floor, lower.k));
    		  }
    	  }
    	  if(parent instanceof Both) {
    		  Both both = (Both) parent;
    		  if(child instanceof Force) {
    			  Force force = (Force)child;
    			  if(both.raise>=force.k) {
    				  return new Force(both.raise);
    			  }
    			  if(both.floor<=force.k) {
    				  return new Force(both.floor);
    			  }
    			  return new Force(force.k);
    		  }
    		  if(child instanceof Lower) {
    			  Lower lower = (Lower)child;
    			  if(lower.k<=both.raise) {
    				  return new Force(both.raise);
    			  }
    			  return new Both(both.raise,Math.min(both.floor, lower.k));
    		  }
    		  if(child instanceof Raise) {
    			  Raise raise = (Raise)child;
    			  if(raise.k>=both.floor) {
    				  return new Force(both.floor);
    			  }
    			  return new Both(Math.max(both.raise, raise.k),both.floor);
    		  }
    		  if(child instanceof Both) {
    			  Both both2 = (Both)child;
    			  if(both.floor<=both2.raise) {
    				  return new Force(both.floor);
    			  }
    			  if(both.raise>=both2.floor) {
    				  return new Force(both.raise);
    			  }
    			  return new Both(Math.max(both.raise,both2.raise),Math.min(both.floor, both2.floor));
    		  }
    	  }
    	  throw new RuntimeException("COMPLIER SHOULD NOT GET HERE");
      }
      abstract static class State{}
      static class Raise extends State{
    	  int k;
    	  public Raise(int a) {
    		  k = a;
    	  }
    	  public String toString() {
    		  return "raise "+k;
    	  }
      }
      static class Lower extends State{
    	  int k;
    	  public Lower(int a) {
    		  k = a;
    	  }
    	  public String toString() {
    		  return "lower "+k;
    	  }
      }
      static class Both extends State{
    	  int raise, floor;
    	  public Both(int a,int b) {
    		  if(a >= b) {
    			  throw new RuntimeException("BALH");
    		  }
    		  raise = a;
    		  floor = b;
    	  }
    	  public String toString() {
    		  return "both "+raise+" "+floor;
    	  }
      }
      static class Force extends State{
    	  int k;
    	  public Force(int a) {
    		  k = a;
    	  }
    	  public String toString() {
    		  return "force "+k;
    	  }
      }
      static String next () throws IOException {
    	  while (st == null || !st.hasMoreTokens())
    		  st = new StringTokenizer(br.readLine().trim());
    	  return st.nextToken();
      }
      
      static long readLong () throws IOException {
    	  return Long.parseLong(next());
      }

      static int readInt () throws IOException {
    	  return Integer.parseInt(next());
      }

      static double readDouble () throws IOException {
    	  return Double.parseDouble(next());
      }
      
      static String readLine () throws IOException {
    	  return br.readLine().trim();
      } 
  }
