import java.util.*;

//task1Count of Substrings with Exactly K Distinct Characters
// public class day7 {
//     static int a(String s, int k){
//         HashMap<Character,Integer>map=new HashMap<>();
//         int L=0;
//         int R=0;
//         int count=0;
//         while(R<s.length()){
//             char c=s.charAt(R);
//             map.put(c,map.getOrDefault(c,0)+1);
//             R++;
//             while(map.size()>k){
//                 char b=s.charAt(L);
//                 map.put(b,map.get(b)-1);
//                 if(map.get(b)==0){
//                     map.remove(b);
//                 }
//                 L++;
//             }
//             count+=R-L;
//             }
//              return count;
//         }
       
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the string:");
//         String s = sc.nextLine();
//         System.out.println("enter the value of k:");
//         int k = sc.nextInt();
//         int result=a(s,k);
//         System.out.println("number of substrings with at most k distinct characters: " + result);

//     sc.close();
// }
// }

//task2

public class day7{
    static int Rohit(String s, String t){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i =0; i<t.length();i++){
            char c= t.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int requiredCount = map.size();
        HashMap<Character,Integer>window=new HashMap<>();
        int L=0;
        int R=0;
        int smallest=0;
        while(R<s.length()){
            char c=s.charAt(R);
window.put(c,window.getOrDefault(c,0)+1);
R++;
if(window.equals(map)){
    for(int i=L;i<R;i++){
        char f=s.charAt(i);
window.put(f,window.get(f)-1);
if(window.get(f)==0){
    window.remove(f);
}
L++;}
} smallest=Math.min(smallest,R-L);
        }
   return smallest;
}
}