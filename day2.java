// Task 1 — Linear Search

// Write a method:

// int findIndex(int[] arr, int target)

// Return index or -1.

// Task 2 — Count Occurrences

// Given an array and a number x, count how many times x appears.

// Task 3 — Build Prefix Sum

// Write a method:

// int[] prefixSum(int[] arr)

// Task 4 — Range Sum Query

// Given:

// prefix array

// L and R

// Return sum in O(1).

import java.util.Scanner;

public class day2 {
    //task1
    // static int findIndex(int[] arr, int target) {
    //     for(int i=0;i <arr.length;i++){
    //         if(arr[i]==target){return i;}
    //     }
    //     return -1;
    // }

    // //task2
    //  static int countOccurrences(int[] arr, int target) {
    //     int count = 0;
        
    //     for (int i=0; i < arr.length; i++) {
    //         if (arr[i] == target) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // //task3
    // static int[] prefixsum(int[] arr){
    //     int[] prefix=new int[arr.length];
    //     prefix[0]=arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         prefix[i]=prefix[i-1]+arr[i];
    //     }
    //     return prefix;
    // }

    //task4 
    //      static int[] prefixsum1(int[] arr){
    //         int[] prefix=new int[arr.length];
    //         prefix[0]=arr[0];
    //         for(int i=1;i<arr.length;i++){
    //             prefix[i]=prefix[i-1]+arr[i];
    //         }
    //         return prefix;
    //     }
    // static int rangeSum(int[] prefix, int L, int R){
    //     if(L==0){
    //         return prefix[R];
    //     }
    //     return prefix[R]-prefix[L-1];
    // }

        //task5
        static int[] prefixsum2(int[] arr){
            int prefix[]=new int[arr.length];
            prefix[0]=arr[0];
            for(int i=1;i<arr.length;i++){
                prefix[i]=prefix[i-1]+arr[i];
            }
            return prefix;

        }

        static int rangesum2(int prefix[],int L,int R){
            if(L==0){
                return prefix[R];
            }
            else{
                return prefix[R]-prefix[L-1];
            }
            }
        



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//         //task1
//            System.out.println("enter size of element you want to insert:");
//         int n =sc.nextInt();
//         int [] arr=new int[n];
//         for(int i=0; i<n; i++){
//             System.out.print("enter"+i+":");
//             arr[i]=sc.nextInt();
//         }

//         System.out.println("Number you want to search index of:");
//         int a=sc.nextInt();
     
//         int index=findIndex(arr,a);
//         System.out.println("Index of "+a+" is "+index);

//         //task2 
//         System.out.println("enter size of element you want to insert for occurrence count:");
//         int n1 =sc.nextInt();
//          int [] arr1=new int[n1];
//         for(int i=0; i<n1; i++){
//             System.out.println("enter"+i+":");
//             arr1[i]=sc.nextInt();
//         }
//         System.out.println("Number you want to count occurrences of:");
//         int a1 =sc.nextInt();
      
//         int occ=countOccurrences(arr1,a1);
//         System.out.println("Occurrences of "+a1+" is "+occ);

//         //task3
//         System.out.println("enter size of element you want to insert for prefix sum:");
//         int n2=sc.nextInt();
//         int [] arr2=new int[n2];
//         for(int i=0; i<n2; i++){
//             System.out.println("enter"+i+":");
//             arr2[i]=sc.nextInt();
//         }
// System.out.println("enter index you want to get prefix sum upto:");
// int a3=sc.nextInt();
//         int[] prefix=prefixsum(arr2);
//         System.out.println("Prefix sum upto index "+a3+" is "+prefix[a3]);


        //task4
        // System.out.println("enter size of element you want to insert for range sum:");
        // int n3=sc.nextInt();
        // int [] arr3=new int[n3];
        // for(int i=0; i<n3; i++){
        //     System.out.println("enter"+i+":");
        //     arr3[i]=sc.nextInt();
        // }

        // System.out.println("enter L and R index for range sum:");
        // int L=sc.nextInt();
        // int R=sc.nextInt();

        // int[] prefix1=prefixsum1(arr3);
        // int range_sum=rangeSum(prefix1,L,R);
        // System.out.println("Range sum from index "+L+" to "+R+" is "+range_sum);


        //task5
        System.out.println("enter size of element you want to insert for range sum:");
        int n4=sc.nextInt();
        int [] arr4=new int[n4];
        for(int i=0;i<arr4.length;i++){
            System.out.println("enter"+i+":");
            arr4[i]=sc.nextInt();
        }

        System.out.println("Enter number of queries you are going to ask");
        int q =sc.nextInt();
        
            int[] L=new int[q];
            int[] R=new int[q];
            for(int i=0;i<q;i++){
                System.out.println("enter L and R index for query "+(i)+":");
                L[i]=sc.nextInt();
                R[i]=sc.nextInt();
            }

            int prefix2[]=prefixsum2(arr4);
            for(int i=0;i<q;i++){
                int range_sum2=rangesum2(prefix2,L[i],R[i]);
                System.out.println("Range sum from index "+L[i]+" to "+R[i]+" is "+range_sum2);
            }
        
        sc.close();
    }
}