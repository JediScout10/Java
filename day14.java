import java.util.*;
public class day14 {

//task1:Product of Array Except Self
    static int[] PrefixProduct(int [] arr){
int n=arr.length;
int [] result=new int[n];
result[0]=1;
for(int i =1; i<n;i++){
    result[i]=result[i-1]*arr[i-1];
}
int right=1;
for (int i =n-1;i>=0;i--){
    result[i]=right*result[i];
    right=right*arr[i];
}
return result;
    }

//task2:Maximum Product Subarray
static int maxproduct(int []arr){
    int max=arr[0];
int min=arr[0];
int result=arr[0];
 for (int i =1;i<arr.length;i++){
    int tempmax=Math.max(arr[i],Math.max(arr[i]*max,arr[i]*min));
int tempmin=Math.min(arr[i],Math.min(arr[i]*min,arr[i]*max));

max=tempmax;
min=tempmin;
result=Math.max(result,max);
 }
return result;
}

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

//task1:Product of Array Except Self
System.out.println("enter the size of array");
int n= sc.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++){
    System.out.println("enter number"+(i+1));
    arr[i]=sc.nextInt();
}
int [] result=PrefixProduct(arr);
for(int i=0;i<n;i++){
    System.out.println(" "+result[i]);
}

//task2:Maximum Product Subarray
System.out.println("enter the size of array");  
int n1=sc.nextInt();
int [] arr1=new int[n1];
for(int i=0;i<n1;i++){
    System.out.println("enter number"+(i+1));
    arr1[i]=sc.nextInt();
}
int result1=maxproduct(arr1);
System.out.println("Maximum product of subarray: "+result1);

sc.close();
}
}