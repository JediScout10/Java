//Task 1: Frequency counting using HashMap
import java.util.*;
// public class day5 {
//     static void Frequencycounting(int [] arr){
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             map.put(arr[i],map.getOrDefault(arr[i],0)+1);

//         }
//         System.out.println(map);
//     }

//     public static void main(String[] args){
// System.out.println("enter size of array:");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// System.out.println("enter the elements of array:");
// int arr[]=new int[n];
// for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
//     }
// Frequencycounting(arr);
// sc.close();
// }
// }

// //task2:First Non-Repeating Element
// public class day5{
//     static void NonRepeating(int[] arr){
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//         }
//         System.out.println(map);
//         for(int i=0;i<arr.length;i++){
//             if(map.get(arr[i])==1){
//                 System.out.println(arr[i]);
//                 return;
//             }
//         }
//     }
//     public static void main(String[] args){
//         System.out.println("enter size of array:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println("enter the elements of array:");
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//             }
//             NonRepeating(arr);
//             sc.close();
//     }
// }

//task3:Count frequency of each character in a string.
// public class day5{
//     static void CharFrequency(String s){
//         HashMap<Character,Integer> map=new HashMap<>();
//         for (int i=0;i<s.length();i++){
//             char c=s.charAt(i);
//             map.put(c,map.getOrDefault(c,0)+1);
//         }
//         System.out.println(map);
//     }
//     public static void main(String[] args){
//         System.out.println("enter a string:");
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         CharFrequency(s);
//         sc.close();
//     }
// }

//task4:Find the first character that appears only once.
// public class day5{
//     static void FirstNonRepeatingChar(String s){
//         HashMap<Character,Integer> map=new HashMap<>();
//         for (int i=0;i<s.length();i++){
//             char c=s.charAt(i);
//             map.put(c,map.getOrDefault(c,0)+1);
//         }
//         System.out.println(map);
//         for (int i=0;i<s.length();i++){
//             char c=s.charAt(i);
//             if(map.get(c)==1){
//                 System.out.println(c);
//                 return;
//             }
//         }
//     }
//     public static void main(String[] args){
//         System.out.println("enter a string:");
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         FirstNonRepeatingChar(s);
//         sc.close();
//     }
// }

//task5:Check if two strings are anagrams of each other.
// public class day5{
//     static void anagram(String s1, String s2){
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(int i=0;i<s1.length();i++){
//             char c=s1.charAt(i);
//             map.put(c,map.getOrDefault(c,0)+1);
//         }
//          HashMap<Character,Integer> map2=new HashMap<>();
//          for(int i=0;i<s2.length();i++){
//             char c=s2.charAt(i);
//             map2.put(c,map2.getOrDefault(c,0)+1);
//         }
       
//         if(map.equals(map2)){
//             System.out.println("the strings are anagrams");
//         }
//         else{
//             System.out.println("the strings are not anagrams");
//         }
//     }
//     public static void main(String[] args){
//         System.out.println("enter first string:");
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.nextLine();
//         System.out.println("enter second string:");
//         String s2 = sc.nextLine();
//         anagram(s1,s2);
//         sc.close();
//     }
// }