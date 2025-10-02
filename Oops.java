// class Student{
//         int age;
//             String name;
//                 int marks;
//                     void display(){
//                             System.out.print("name :"+name+" age: "+age+" marks: "+marks);
//                                 }

//                                 }
//                                     public class Oops {
//                                     public static void main(String[] args){
//                                     Student s1= new Student();
//                                     s1.age=20;
//                                     s1.name="Rohit";
//                                     s1.marks=36;
//                                     s1.display();
//                                     }}
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

 class ShapeCalulator{
   private int side;
    private int length;
    private int breadth;
   int Recarea;
   int squarea;
   double circumference;
    double radius;
 public void setarea(int side){
    this.side=side;
    this.squarea=side*side;
 }

 public void setarea(int length, int breadth){
    this.length= length;
    this.breadth=breadth;
    this.Recarea=length*breadth;
 }

 public void setarea(double radius){
    this.radius=radius ;
    this.circumference= 3.14* radius*radius;
 }
public int getarea(){
return squarea;
}

 }