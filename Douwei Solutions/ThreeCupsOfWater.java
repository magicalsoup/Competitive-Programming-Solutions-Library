package Douwei;
import java.util.*;

public class ThreeCupsOfWater {
     
    public static int volumeA, volumeB, volumeC;
    public static int targetA, targetB, targetC;
    public static boolean keepgoing=true;
     
    public static int bbfs(){
        int level=0;
        Queue<Integer> que = new LinkedList<Integer>();
        Map<Integer, Integer> curA = new HashMap<Integer, Integer>();
        Map<Integer, Integer> curB = new HashMap<Integer, Integer>();
        Map<Integer, Integer> curC = new HashMap<Integer, Integer>();       
         
        Set<Integer> beenthere = new HashSet<Integer>();
         
        int count=0;
         
        que.add(0);
        que.add(-1);
        curA.put(0, volumeA);
        curB.put(0, 0);
        curC.put(0, 0);
         
        boolean yatta = false;
        while(level<=30&&!que.isEmpty()){
            int key = que.poll();
            if(key==-1){
                level++;
                que.add(-1);
            }
            else{
                //Exit card
                if(curA.get(key)==targetA&&curB.get(key)==targetB&&curC.get(key)==targetC){
                    yatta = true;
                    break;
                }
                 
                int curvolA=curA.get(key);
                int curvolB=curB.get(key);
                int curvolC=curC.get(key);
                if(!beenthere.contains(curvolA*100+curvolB*10+curvolC)){
                    //Makes new children for A
                    if(curA.get(key)!=0){
                        if(curvolA+curvolB>volumeB){
                            count++;
                            que.add(count);
                            curA.put(count, curvolA+curvolB-volumeB);
                            curB.put(count, volumeB);
                            curC.put(count, curvolC);
                        }
                        else{
                            count++;
                            que.add(count);
                            curA.put(count, 0);
                            curB.put(count, curvolA+curvolB);
                            curC.put(count, curvolC);
                        }
                        if(curvolA+curvolC>volumeC){
                            count++;
                            que.add(count);
                            curA.put(count, curvolA+curvolC-volumeC);
                            curB.put(count, curvolB);
                            curC.put(count, volumeC);
                        }
                        else{
                            count++;
                            que.add(count);
                            curA.put(count, 0);
                            curB.put(count, curvolB);
                            curC.put(count, curvolA+curvolC);
                        }
                    }
             
                    //Makes new children for B
                    if(curB.get(key)!=0){
                        if(curvolB+curvolA>volumeA){
                            count++;
                            que.add(count);
                            curA.put(count, volumeA);
                            curB.put(count, curvolB+curvolA-volumeA);
                            curC.put(count, curvolC);
                        }
                        else{
                            count++;
                            que.add(count);
                            curA.put(count, curvolB+curvolA);
                            curB.put(count, 0);
                            curC.put(count, curvolC);
                        }
                        if(curvolB+curvolC>volumeC){
                            count++;
                            que.add(count);
                            curA.put(count, curvolA);
                            curB.put(count, curvolB+curvolC-volumeC);
                            curC.put(count, volumeC);
                        }
                        else{
                            count++;
                            que.add(count);
                            curA.put(count, curvolA);
                            curB.put(count, 0);
                            curC.put(count, curvolB+curvolC);
                        }
                    }
                     
                    //Makes new children for C
                    if(curC.get(key)!=0){
                        if(curvolC+curvolA>volumeA){
                            count++;
                            que.add(count);
                            curA.put(count, volumeA);
                            curB.put(count, curvolB);
                            curC.put(count, curvolC+curvolA-volumeA);
                        }
                        else{
                            count++;
                            que.add(count);
                            curA.put(count, curvolC+curvolA);
                            curB.put(count, curvolB);
                            curC.put(count, 0);
                        }
                        if(curvolC+curvolB>volumeB){
                            count++;
                            que.add(count);
                            curA.put(count, curvolA);
                            curB.put(count, volumeB);
                            curC.put(count, curvolC+curvolB-volumeB);
                        }
                        else{
                            count++;
                            que.add(count);
                            curA.put(count, curvolA);
                            curB.put(count, curvolC+curvolB);
                            curC.put(count, 0);
                        }
                    }
                }
            beenthere.add(curvolA*100+curvolB*10+curvolC);
            }
        }
        if(yatta==false){
            return -1;
        }
        return level;
    }
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        volumeA = sc.nextInt();
        volumeB = sc.nextInt();
        volumeC = sc.nextInt();
        targetA = sc.nextInt();
        targetB = sc.nextInt();
        targetC = sc.nextInt();
         
        System.out.println(bbfs());
    }
}
