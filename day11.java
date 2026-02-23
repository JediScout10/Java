
import java.util.*;
public class day11 {
    //task1:Count of subarrays with sum equal to k
    static int prefixsum(int [] arr , int k){ 
        int count=0; 
        int [] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i =1; i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            
         
        if (map.containsKey(prefix[i]-k)) {   
            count+=map.get(prefix[i]-k);
        }
        map.put(prefix[i],map.getOrDefault(prefix[i],0)+1);
    }
    return count;
}
//TASK2:Maximum Subarray (Kadane’s Algorithm)
static int maxSubArray(int[] arr){
int CurrentSum=arr[0];
int MaxSum=arr[0];
for(int i=1;i<arr.length;i++){
    if(arr[i]>CurrentSum+arr[i]){
        CurrentSum=arr[i];
    }else{
        CurrentSum=CurrentSum+arr[i];
    }
    if(MaxSum<CurrentSum){
        MaxSum=CurrentSum;
    }
}
return MaxSum;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //task1:
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value of k:");
        int k=sc.nextInt();
        int  result=prefixsum(arr,k);
        System.out.println("number of subarrays with sum equal to k: " + result);

            //TASK2
    System.out.println("enter the size of the array:");
    int n1 = sc.nextInt();   
    int [] arr1=new int[n1];
    System.out.println("enter the elements of the array:");
    for(int i=0;i<n1;i++){
        arr1[i]=sc.nextInt();
    }
    int result2=maxSubArray(arr1);
    System.out.println("maximum sum of a contiguous subarray: " + result2);
sc.close();}

}
