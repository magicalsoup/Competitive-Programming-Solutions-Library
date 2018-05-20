import java.util.*;
public class ccc97s4{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int entries = sc.nextInt();
        sc.nextLine();
        String lines = "";
        while(entries-->0){
            String dictionary[] = new String[50000];
            Arrays.fill(dictionary,"|");
            int finds = 0, trigger =0;
            do{
                lines=  sc.nextLine();
                String compress = "";
                trigger =0;
                String words[] = lines.split(" ");
                if(lines.isEmpty()){
                    finds = 0;
                    System.out.println("");
                    break;
                }
                else{
                    for(int i=0;i<words.length;i++){
                        trigger =0;
                        for(int find =0;find<=finds;find++){
                            if(words[i].equals( dictionary[find])){
                                words[i] = Integer.toString(find);
                                trigger = 1;
                                break;
                            }
                        }
                        if(trigger==0){
                            finds++;
                            dictionary[finds] = words[i];
                        }
                        compress+=words[i];
                        if(i!=words.length-1)
                        compress+=" ";
                    }
                }
                System.out.println(compress);
            }while(true);
        }
         
     }
}