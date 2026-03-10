import java.util.*;
public class day15 {
 static int maxArea(int[] height) {
 int maxarea=Integer.MIN_VALUE;
 int max1=height[0];
 for (int i=1;i<height.length;i++){
    if (height[i]>max1){
        max1=height[i];
    }
    maxarea=Math.max(maxarea,(height[i]*max1));
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
