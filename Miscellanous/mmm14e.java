 import java.util.*;
 import java.io.*;
 import java.math.*;
    public class mmm14e{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static final int MOD = 1000000007;
      public static void main(String[]args) throws Exception{
    	  StringBuilder sb = new StringBuilder();
    	  String line;
    	  while((line = br.readLine())!=null)
    	  {
    		  sb.append(' ');
    		  sb.append(line);
    	  }
    	  String s = sb.toString().trim();
    	  
    	  sb = new StringBuilder();
    	  
    	  int brac = 0;
    	  boolean quoting = false;
    	  for(int i=0;i<s.length();i++)
    	  {
    		  char c = s.charAt(i);
    
    		  if(c=='['||c=='{')
    			  brac++;
    		  else if(c==']'||c=='}')
    			  brac--;
    		  else if(brac==0)
    		  {
    			  if(c=='"')
    				  quoting = !quoting;
    			  else
    			  {
    				  if(c==' '&&quoting)
    					  sb.append('a');
    				  else
    					  sb.append(c);
    			  }
    		  }
    	  }
    	  s = sb.toString().trim();
    	  
    	  String [] tokens = s.split(" +");
    	  
    	  ArrayList<Integer>pts = new ArrayList<Integer>();
    	  
    	  for(int i=0;i<tokens.length;i++)
    		  if(tokens[i].equals("::="))
    			  pts.add(i);
    	  
    	  Node[] nodes = new Node[pts.size()];
    	  Map<String,Node> map = new HashMap<String,Node>();
    	  for(int i=0;i<pts.size();i++)
    	  {
    		  nodes[i] = new Node();
    		  nodes[i].name = tokens[pts.get(i)-1];
    		  map.put(nodes[i].name, nodes[i]);
    	  }
    	  
    	  for(int i=0;i<pts.size();i++)
    	  {
    		  int end = (i==pts.size()-1)?tokens.length:(pts.get(i+1)-1);
    		  
    		  Edge e = new Edge(nodes[i]);
    		  
    		  for(int j=pts.get(i)+1;j<end;j++)
    		  {
    			  if(tokens[j].equals("|"))
    			  {
    				  if(e.counter==0)
    				  {
    					  nodes[i].push(BigInteger.valueOf(e.liten));
    				  }
    				  e = new Edge(nodes[i]);
    			  }
    			  else
    			  {
    				  Node n = map.get(tokens[j]);
    				  if(n!=null)
    				  {
    					  e.counter++;
    					  n.dependents.add(e);
    				  }
    				  else if(tokens[j].equals("<EOL>"))
    					  e.liten++;
    				  else
    					  e.liten+=tokens[j].length();
    			  }
    		  }
    		  if(e.counter==0)
    		  {
    			  nodes[i].push(BigInteger.valueOf(e.liten));
    		  }
    	  }
    	  PriorityQueue<EInfo> Q = new PriorityQueue<EInfo>();
    	  
    	  for(int i=0;i<nodes.length;i++)
    		  if(nodes[i].best!=null)
    			  Q.add(new EInfo(nodes[i]));
    	  
    	 
    	  while(!Q.isEmpty())
    	  {
    		  EInfo ei = Q.remove();
    		  
    		  
    		  Node n = ei.n;
    		  if(n.seen)
    			  continue;
    		  n.seen = true;
    		  
    		  for(Edge e:n.dependents)
    		  {
    			  e.counter--;
    			  e.tlen = e.tlen.add(n.best);
    			  if(e.counter==0)
    			  {
    				  Node o = e.target;
    				  if(o.push(e.tlen.add(BigInteger.valueOf(e.liten))))
    				  {
    					  Q.add(new EInfo(e.target));
    				  }
    			  }
    		  }
    	  }
    	  BigInteger x = map.get("<essay>").best;
    	  if(x==null) {
    		  out.println(-1);
    		  out.close();
    	  }
    	  else
    	  {
    		  x = x.mod(BigInteger.valueOf(MOD));
    		  out.println(x);
    		  out.close();
    	  }
      }
      static class Edge 
      {
    	final Node target;
    	int liten = 0;
    	int counter = 0;
    	BigInteger tlen = BigInteger.ZERO;
    	
    	Edge(Node n)
    	{
    		target = n;
    	}
      }
      static class Node
      {
    	  ArrayList<Edge> dependents = new ArrayList<Edge>();
    	  BigInteger best = null;
    	  boolean seen = false;
    	  String name;
    	  
    	  boolean push(BigInteger x)
    	  {
    		  if(best==null||best.compareTo(x)>0)
    		  {
    			  best = x;
    			  return true;
    		  }
    		  else
    			  return false;
    	  }
      }
    	  static class EInfo implements Comparable<EInfo>
    	  {
    		  final BigInteger val;
    		  final Node n;
    		  
    		  public EInfo(Node n)
    		  {
    			  this.val = n.best;
    			  this.n = n;
    		  }
    		  
    		  public int compareTo(EInfo o)
    		  {
    			  return val.compareTo(o.val);
    		  }
    	  }
  }
