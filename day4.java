import java.util.*;

// Task 1 — Check duplicates
// Return true if array has duplicates.

// public class day4 {
//     static boolean Duplicate(int[] arr){
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<arr.length;i++){
//             if(set.contains(arr[i])){
//                 return true;
//             }
//             set.add(arr[i]);
//         }
//         return false;
//     }

//     public static void main(String [] args){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter size of array:");
//         int n=sc.nextInt();
//         System.out.println("enter the elements of array:");
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         boolean result=Duplicate(arr);
//         System.out.println(result);

//         sc.close();
//     }
// }

// task4-Pair sum using HashSet
// (Array may be unsorted)

// public class day4{
// static boolean PairSum(int []arr ,int x){
// HashSet<Integer> set=new HashSet<>();
// for(int i =0 ; i<arr.length;i++){
//     int n = x - arr[i];
//     if (set.contains(n)){
//         System.out.println("pair found: " + arr[i] + " + " + n + " = " + x);
//     return true;
// }
// set.add(arr[i]);

// }
// return false;
// }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter size of array:");
//     int n = sc.nextInt();
//     System.out.println("enter the elements of array:");
//     int arr[]=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
//     System.out.println("enter the sum you want to find:");
//     int x=sc.nextInt();
//     boolean result=PairSum(arr,x);
//     System.out.println(result);

//     sc.close();
// }
// }


