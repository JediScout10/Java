public class Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print("Array elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // For loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}

// import java.util.*;
// public class Array {
// public static void main(String[] args) {
// Scanner sc =new Scanner(System.in);
// System.out.print("Enter size of array: ");
// int n=sc.nextInt();
// int[] arr=new int[n];
// for (int i=0; i<n; i++) {
// arr[i]=sc.nextInt();
// }

// System.out.print("Array elements: ");
// for(int i:arr) {
// System.out.print(i+" ");
// }
// int max=arr[0];
// for(int i=0; i<n; i++){

// if(arr[i]>=max){
// max=arr[i];
// }
// }
// System.out.println("\nMaximum element is: "+max);
// sc.close();

// }
// }