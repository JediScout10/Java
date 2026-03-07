import java.util.*;
public class day13 {
    //task1:Kadane’s Algorithm
    static int kadaneAlgo(int[] arr){
        int currentsum=arr[0];
        int maxsum=arr[0];
        for (int i =1;i<arr.length;i++){
            if (arr[i]>currentsum+arr[i]){
                currentsum=arr[i];
            }
            else{
               currentsum=currentsum+arr[i]; 
            }
            if(maxsum<currentsum){
                maxsum=currentsum;
            }
        }
   return maxsum;
    }


    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int n =sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the "+n+ "elements");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
int result=kadaneAlgo(arr);
System.out.println("the maximus subarray :"+result);
sc.close();
    }
}
