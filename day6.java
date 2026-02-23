// import java.util.*;
//task1-Find the length of the longest substring without repeating characters

// public class day6 {
//     static int a1(String s){
//         HashSet<Character> set=new HashSet<>();
//         int L=0;
//         int R=0;
//         int max=0;
//            while(R<s.length()){
//             char c=s.charAt(R);
//             if(!set.contains(c)){
//                 set.add(c);
//                 max=Math.max(max,R-L+1);
//                 R++;
                
//             } else {
//                 set.remove(s.charAt(L));
//                 L++;
//             }
//            }
//            return max;
//         }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the string:");
//         String s = sc.nextLine();
//         int result=a1(s);
//         System.out.println("length of longest substring without repeating characters: " + result);
//     sc.close();}
// }

//task2-Find the length of the longest substring with at most k distinct characters
// public class day6{
//     static int a2(String s, int k){
// HashMap<Character,Integer>map=new HashMap<>();
// int L=0;
// int R=0;
// int max=0;
// while(R<s.length()){
//     char c=s.charAt(R);
// map.put(c,map.getOrDefault(c,0)+1);
//     R++;
// while(map.size()>k){
//     char leftChar = s.charAt(L);
//     map.put(leftChar, map.get(leftChar) - 1);
//     if(map.get(leftChar) == 0) {
//         map.remove(leftChar);
//     }
//     L++;
// }
// max=Math.max(max,R-L);
// }
//     return max;
// }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the string:");
//     String s = sc.nextLine();
//     System.out.println("enter the value of k:");
//     int k = sc.nextInt();
//     int result=a2(s,k);
//     System.out.println("length of longest substring with at most k distinct characters: " + result);
// sc.close();
// }
// }

import java.util.HashMap;

public class day6{
    //TASK1:
    static int sub(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int L=0;
        int R=0;
        int max=Integer.MIN_VALUE;
        while(R<s.length()){
            char c=s.charAt(R);
            map.put(c,map.getOrDefault(c,0)+1);
            R++;
            while(map.get(c)>1){
                char leftChar=s.charAt(L);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                L++;
            }
            max=Math.max(max,R-L);
    
}
return max;
    }
    public static void main(String[] args){
        String s="abcabcdbb";
        int result=sub(s);
        System.out.println("length of longest substring without repeating characters: " + result);
    }
}