import java.util.*;

public class day8{
    static int maxSum(int[] arr, int k){
int L=0;
int R=0;
int max=0;
int windowsum=0;
HashSet<Integer> set=new HashSet<>();
while(R<arr.length){
if(!set.contains(R)){
set.add(R);
while(R>k){
windowsum+=arr[R];
R++;
max=windowsum;
for(int i=k;i<arr.length;i++){
max=max - arr[i-k] + arr[i];
}
}
}
max=Math.max(max,windowsum);
}
return max;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array:");
    int n = sc.nextInt();
    System.out.println("enter the elements of array:");
    int arr[]=new int[n];   
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
System.out.println("enter the size of subarray k:");
int k=sc.nextInt();
    int result=maxSum(arr,k);
    System.out.println("maximum sum of subarray of size k: " + result);

sc.close();
}
}