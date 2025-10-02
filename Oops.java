// class Student {
//     String name;
//     int age;

//     // Constructor
//     Student() {
//         name = "Unknown";
//         age = 0;
//     }

//     void display() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }

// public class Oops {
//     public static void main(String[] args) {
//         Student s1 = new Student(); // constructor called automatically
//         s1.display(); // Name: Unknown, Age: 0
//     }
// }

// class Student {
//     String name;
//     int age;

//     // Parameterized constructor
//     Student(String n, int a) {
//         name = n;
//         age = a;
//     }

//     void display() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }

// public class Oops {
//     public static void main(String[] args) {
//         Student s1 = new Student("Rohit", 20);
//         Student s2 = new Student("Maya", 19);
//         s1.display(); // Name: Rohit, Age: 20
//         s2.display(); // Name: Maya, Age: 19
//     }
// }

//  Encapsulation with Getters and Setters and Input Validation                        
// import java.util.Scanner;

// class BankAccount {
//     private int accountNumber;
//     private String accountHolderName;
//     private double balance;

//     public void setBalance(double balance) {
//         if (balance >= 0){
//             this.balance = balance;
//         } else {
//             System.out.println("Balance cannot be negative.");
//         }
//     }
    
//     public double getBalance() {
//         return balance;
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println(amount + " deposited successfully.");
//         } else {
//             System.out.println("Deposit amount must be positive.");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println(amount + " withdrawn successfully.");
//         } else {
//             System.out.println("Invalid withdraw amount.");
//         }
//     }

//     BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         if (initialBalance >= 0){
//             this.balance = initialBalance;
//         } else {
//             System.out.println("Initial balance cannot be negative. Setting balance to 0.");
//             this.balance = 0;
//         }
//     }

//     public void display() {
//         System.out.println("Account Number: "+accountNumber);
//         System.out.println("Account Holder Name: "+accountHolderName);
//         System.out.println("Balance: "+balance);
//     }
// }

// public class Oops {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         BankAccount account1= new BankAccount(123456, "John Doe", 500.0);

//         account1.display();

//         System.out.print("Enter amount to deposit: ");
//         double depositAmount = sc.nextDouble();
//         account1.deposit(depositAmount);

//         System.out.print("Enter amount to withdraw: ");
//         double withdrawAmount = sc.nextDouble();
//         account1.withdraw(withdrawAmount);

//         account1.display();

//         sc.close();
//     }
// }

//  Encapsulation with Method Overloading

// class ShapeCalculator {
//     private int squareArea;
//     private int rectangleArea;
//     private double circleArea;

//     public void setArea(int side) { 
//         this.squareArea = side * side;
//     }

//     public void setArea(int length, int breadth) { 
//         this.rectangleArea = length * breadth;
//     }

//     public void setArea(double radius) { 
//         this.circleArea = 3.14 * radius * radius;
//     }

//     public int getSquareArea() {
//         return squareArea;
//     }

//     public int getRectangleArea() {
//         return rectangleArea;
//     }

//     public double getCircleArea() {
//         return circleArea;
//     }
// }


//  public class Oops {
//     public static void main(String[] args){
//         ShapeCalculator sc= new ShapeCalculator();
//         sc.setArea(5);
//         System.out.println("Area of square is: "+sc.getSquareArea());
//         sc.setArea(5,6);
//         System.out.println("Area of rectangle is: "+sc.getRectangleArea());
//         sc.setArea(7.5);
//         System.out.println("Area of circle is: "+sc.());
//     }
//  }

//  Encapsulation with Constructor Overloading

// class ShapeCalculator {
//     private int squareArea;
//     private int rectangleArea;
//     private double circleArea;

//     // Constructor for square
//     ShapeCalculator(int side) { 
//         this.squareArea = side * side;
//     }

//     // Constructor for rectangle
//     ShapeCalculator(int length, int breadth) { 
//         this.rectangleArea = length * breadth;
//     }

//     // Constructor for circle
//     ShapeCalculator(double radius) { 
//         this.circleArea = 3.14 * radius * radius;
//     }

//     public int getSquareArea() {
//         return squareArea;
//     }

//     public int getRectangleArea() {
//         return rectangleArea;
//     }

//     public double getCircleArea() {
//         return circleArea;
//     }
//    }

//     public class Oops {
//     public static void main(String[] args) {
//         ShapeCalculator square = new ShapeCalculator(5);
//         System.out.println("Area of Square: " + square.getSquareArea());

//         ShapeCalculator rectangle = new ShapeCalculator(4, 6);
//         System.out.println("Area of Rectangle: " + rectangle.getRectangleArea());

//         ShapeCalculator circle = new ShapeCalculator(7.5);
//         System.out.println("Area of Circle: " + circle.getCircleArea());
//     }
// }
 class Person {
private String name;
private int age;

public void setName(String name) {
    this.name = name;
   
}

public String getName() {
    return name;
}

public void setAge(int age) {
    if (age >= 0) {
        this.age = age;
    } else {
        System.out.println("Age cannot be negative.");
    }
}

public int getAge() {
    return age;
}

}

 class Student extends Person {
   
       public void displayStudent() {
        System.out.println("Student Info: Name=" + getName() +
                           ", Age=" + getAge());
    }


}
class Teacher extends Person {
      public void displayTeacher() {
         System.out.println("Teacher Info: Name=" + getName() +
                              ", Age=" + getAge());
      }
   
}
public class Oops {
   public static void main(String[] args) {
Student s=new Student();
Teacher t=new Teacher();
s.setName("Rohit");
s.setAge(20);
t.setName("DS Patil");   
t.setAge(40);

s.displayStudent();
t.displayTeacher();

}
}