import java.util.*;

public class day10 {
    //task1:Minimum Window Substring
    static int minWindow(String s, String t){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i =0; i<t.length();i++){
            char c=t.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count=map.size();
        int L=0;
        int R=0;
        int min=Integer.MAX_VALUE;
        while(R<s.length()){
            char r=s.charAt(R);
            if(map.containsKey(r)){
            map.put(r,map.get(r)-1);
            if(map.get(r)==0){
                count--;
            }
        }
        R++;
        while(count==0){
            min=Math.min(min,R-L);
            char l=s.charAt(L);
            if(map.containsKey(l)){
                map.put(l,map.get(l)+1);
                if(map.get(l)>0){
                    count++;
                }
               
            }
        L++; }
    }
    return min;
}


public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string:");
    String s = sc.nextLine();
    System.out.println("enter the target string:");
    String t = sc.nextLine();
    int result=minWindow(s,t);
    System.out.println("length of the minimum window substring: " + result);
sc.close();
}
}