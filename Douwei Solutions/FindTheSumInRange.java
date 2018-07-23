package Douwei;
import java.util.Scanner;
 
public class FindTheSumInRange {
     
    static private class Node{
        public int value;
        public Node leftChild;
        public Node rightChild;
         
        public int leftRange;
        public int rightRange;
         
        Node(Node leftChild, Node rightChild){
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
 
        public Node() {
        }
    }
     
    static Node root;
    static int[] ar;
     
    static void createTree(Node node, int left, int right){//inclusive
        int sum = 0;
        for(int i = left; i <= right; i++){
            sum += ar[i];
        }
        node.value = sum;
        node.leftRange = left;
        node.rightRange = right;
         
        //bottom level
        if(left == right) return;
         
        int middle = (left + right) / 2;
         
        createTree(node.leftChild = new Node(), left, middle);
        createTree(node.rightChild = new Node(), middle + 1, right);
    }
     
    static int getSum(Node node, int left, int right){
        if(node.leftRange >= left && node.rightRange <= right){
            return node.value;
        }
        if(node.leftRange > right || node.rightRange < left){
            return 0;
        }
         
        return getSum(node.leftChild, left, right) + getSum(node.rightChild, left, right);
    }
     
    static void update(Node node, int index, int diff){
        if(node.leftRange == node.rightRange){
            node.value += diff;
            ar[node.leftRange] = node.value;
            return;
        }
        if(index < node.leftRange || index > node.rightRange){
            return;
        }
         
        node.value += diff;
         
 
         
        update(node.leftChild, index, diff);
        update(node.rightChild, index, diff);
    }
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        ar = new int[sc.nextInt()];
         
        for(int i = 0; i < ar.length; i++){
            ar[i] = sc.nextInt();
        }
         
        root = new Node();
        createTree(root, 0, ar.length - 1);
         
        int queries = sc.nextInt();
        for(int i = 0; i < queries; i++){
            if(sc.next().equals("Q")){
                System.out.println(getSum(root, sc.nextInt() - 1, sc.nextInt() - 1));
            }
            else{
                int index = sc.nextInt();
                update(root, index - 1, sc.nextInt() - ar[index - 1]);
            }
        }
    }
}
