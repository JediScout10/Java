import java.util.*;
public class day12{
    static int[] productExceptSelf(int[] nums) {

    int n=nums.length;
    int [] result=new int[n];
    result[0]=1;
for (int i=1;i<n;i++){
    result[i]=result[i-1]*nums[i-1];
}
int right=1;
for(int i=n-1;i>=0;i--){
result[i]=right*result[i];
right=right*nums[i];
}
return result;
}
public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the size of array");
   int n=sc.nextInt();
   int arr[]=new int[n];
   
   for(int i=0;i<n;i++){
    System.out.println("enter number"+(i+1));
    arr[i]=sc.nextInt();
   }

   int[] result=productExceptSelf(arr);
   for(int i=0;i<n;i++){
    System.out.print(" "+result[i]);
   }
sc.close();
}}
