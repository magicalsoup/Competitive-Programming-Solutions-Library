import java.util.*;
public class RunningInCircles {
    static Node[]nodes;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int num =0;num<5;num++) {
	        nodes = new Node[1000];
	        for (int i = 0; i < nodes.length; i++)
	            nodes[i] = new Node();
	         
	        int n = sc.nextInt();
	        for (int i = 0; i < n; i++) {
	            int from = sc.nextInt();
	            int to   = sc.nextInt();
	            nodes[from].outEdges.add(nodes[to]);
	        }
	         
	        for (int i = 0; i < nodes.length; i++) {
	            for (int j = 0; j < nodes.length; j++)
	                nodes[j].visited = false;
	            
	            int cycleLen = findCycleLength(nodes[i], nodes[i], 0);
	            if (cycleLen != -1) {
	                System.out.println(cycleLen);
	                break;
	            }
	        }
	    }
        sc.close();
    }
     
    public static int findCycleLength(Node start, Node current, int distance) {
        current.visited = true;
        for (Node next : current.outEdges) {
            if (next == start)
                return distance + 1;
            else if (!next.visited) {
                int temp = findCycleLength(start, next, distance + 1);
                if (temp != -1)
                    return temp;
            }
        }
        current.visited = false;
        return -1;
    }
    private static class Node {
         
        public final List<Node> outEdges;
        public boolean visited;
         
         
        public Node() {
            outEdges = new ArrayList<>();
            visited = false;
        }
         
    }
}
