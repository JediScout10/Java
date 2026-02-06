
// import java.util.*;

//task1
// public class day3{
//     static boolean pairsum(int [] arr,int x){
//         int L=0;
//         int R=arr.length-1;
//         while (L<R) {
//             int sum = arr[L]+arr[R];
//             if (sum==x){
//                 System.out.println("pair found:" + arr[L] + " + " + arr[R] + " = " + x);
//                 return true;
//             }
//             else if(sum>x){
//                 R--;
//             }
//             else{
//                 L++;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter number of items you want to add in array:");
//         int n=sc.nextInt();
//         System.out.println("enter the elements of array:");
//         int arr[]=new int[n];   
//         for (int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("enter the sum you want to find:");
//         int x=sc.nextInt();
//         boolean result=pairsum(arr,x);
//         System.out.println(result);
        
//         sc.close();
//     }
// }

//task2
// public class day3{
//     static void reversearray(int[] arr){
// int L=0;
// int R= arr.length-1;
// while(L<R){
//     int temp=arr[L];
//     arr[L]=arr[R];
//     arr[R]=temp;
//     L++;
//     R--;
// }
// }

    
//     public static void main (String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter size of array:");
//         int n=sc.nextInt(); 
//         int arr[]=new int[n];
//         System.out.println("enter elements of array:"); 
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         reversearray(arr);
//         System.out.println("reversed array is:");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }

//         sc.close();
//     }


//task3

// public class day3{
//     static int maxsum(int[] arr, int k){
//       int max=0;
//       int windowSum=0;
//       for(int i =0;i<k;i++){
//         windowSum +=arr[i];
//       }
//         max=windowSum;

//         for(int i =k;i<arr.length;i++){
//             windowSum +=arr[i]-arr[i-k];
// if(windowSum>max){
//     max=windowSum;
//         }

//     }
// return max;
//     }

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter size of array:");
//     int n=sc.nextInt();
//     int arr[]=new int[n];
//     System.out.println("enter elements of array:");
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
//     System.out.println("enter size of subarray:");
//     int k=sc.nextInt();
//     int result=maxsum(arr,k);
//     System.out.println("maximum sum of subarray of size "+ k + " is: " + result);
// sc.close();
// }
// }

//task4
// public class day3{
//     static int minisum(int [] arr ,int k){
//         int min=0;
//         int windowSum=0;
//         for(int i=0;i<k;i++){
//             windowSum+=arr[i];
//         }
//         min=windowSum;
//         for(int i=k;i<arr.length;i++){
// windowSum+=arr[i]-arr[i-k];
// if(windowSum<min){
//     min=windowSum;
// }
//         }
//         return min;
//         }

//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             System.out.println("enter size of array:");
//             int n=sc.nextInt();
//             int arr[]=new int[n];
//             System.out.println("enter elements of array:");
//             for(int i=0;i<n;i++){
//                 arr[i]=sc.nextInt();
//             }
//             System.out.println("enter size of subarray:");
//             int k=sc.nextInt();
//             int result=minisum(arr,k);
//             System.out.println("minimum sum of subarray of size "+ k + " is: " + result);
       
//        sc.close();
//     }
//     }
