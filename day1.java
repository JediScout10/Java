// Task 1

// Write a method to find minimum element in array.

// Task 2

// Write a method to count odd numbers.

// Task 3

// Write a method to check:

// Is array sorted in ascending order?

// (Hint: compare arr[i] with arr[i+1])
import java.util.*;
public class day1 {
    //task1
    static int minelement(int[] arr){
        int min=arr[0];
        for(int i=0; i<arr.length; i++ ){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    //task2
    static int countodd(int[] arr){
        int count=0;
        for (int i =0; i<arr.length;i++){
            if(arr[i]%2 != 0){
                count++;
            }

        }
        return count;
    }

    //task3
    static boolean issorted(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }

        }
        return true;
    }
   public static void main(String[] agg)  {
Scanner sc=new Scanner(System.in);
System.out.print("enter size of element you want to insert:");
int n =sc.nextInt();
int [] a=new int[n];
for(int i=0; i<n; i++){
    System.out.print("enter"+i+":");
    a[i]=sc.nextInt();
}

int min =minelement(a);;
System.out.println("smallest number:"+min);

int[] b=new int[n];
for(int i=0;i<n;i++){
    System.out.print("enter"+i+":");
    b[i]=sc.nextInt();
}
int count=countodd(b);
System.out.println("number of odd number:"+count);

int[] c=new int[n];
for(int i=0;i<n;i++){
    System.out.print("enter"+i+":");
    c[i]=sc.nextInt();
}
boolean sorted=issorted(c);
System.out.println("is array sorted:"+sorted);

sc.close();


   }
}
