import java.util.Scanner;

public class Control_Flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your name: ");
        String name = sc.next(); // single word
        // String name = sc.nextLine(); // full line

        System.out.println("Hello " + name + ", your age is " + age);

        sc.close();
        int a = age;

        if (a >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

    }
}
