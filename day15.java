import java.util.*;
public class day15 {
    //task1:
 static int maxArea(int[] arr) {
    int right=arr.length-1;
    int left=0;
    int maxarea=Integer.MIN_VALUE;
    while(left<right){
        int height=Math.min(arr[left],arr[right]);
        int width=right-left;
        int area=width*height;
         maxarea=Math.max(maxarea,area);
         if (arr[left]<arr[right]){
            left++;}
            else{
                right--;
            }
         }
    
        return maxarea;
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
int n= sc.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++){
    System.out.println("enter number"+(i+1));
    arr[i]=sc.nextInt();
}

int result= maxArea(arr);
System.out.println(result);

sc.close();
}
}
