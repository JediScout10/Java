import java.util.*;
public class day16 {
// task1:Problem — Two Sum II (Sorted Array)
public int[] twoSum(int[] arr, int target) {
int left=0;
int right=arr.length-1;

int [] result=new int[2];
while (left<right){
    int sum=arr[left]+arr[right];
if(sum==target){
    result[0]=arr[left];
    result[1]=arr[right];
return result;
}
else if(sum>target){
    right--;
}
else{
    left++;
}
}
return result;
}


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
int [] arr=new int[n];
for(int i=0;i<n;i++){
    System.out.println("enter number"+(i+1));
    arr[i]=sc.nextInt();}
System.out.println("enter the target sum");
int target=sc.nextInt();
day16 obj=new day16();
int [] result=obj.twoSum(arr,target);
for(int i=0;i<2;i++){
    System.out.println(result[i]);
}


sc.close();}

}
