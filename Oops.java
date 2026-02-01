// class Student {
//     String name;
//     int age;

//     // Constructor
//     Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     void display() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }

//  public class Oops {
//     public static void main(String[] args) {
//         Student s1 = new Student("Rohit", 20); // constructor called automatically
//         s1.display(); 
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
//         BankAccount account1= new BankAccount(123456, "Sir Rohit", 50000000.0);

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

// Inheritance with Method Overriding and Method Overloading
// import java.util.Scanner;

// class Shape {
//     // common contract: every shape can compute area
//     double area() {
//         System.out.println("Area not defined for base Shape.");
//         return 0.0;
//     }
// }

// class Square extends Shape {
//     private int side;

//     Square(int side){ 
//         this.side = side; 
//     }

//     @Override
//     double area() {
//         return (double) side * side;
//     }
// }

// class Rectangle extends Shape {
//     private int length, breadth;

//     Rectangle(int length, int breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     @Override
//     double area() {
//         return (double) length * breadth;
//     }
// }

// class Circle extends Shape {
//     private double radius;

//     Circle(double radius) { this.radius = radius; }

//     @Override
//     double area() {
//         return 3.14 * radius * radius;
//     }
// }

// // Separate utility class demonstrating method overloading
// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }
//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
//     double add(double a, double b) {
//         return a + b;
//     }
// }

// public class Oops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter side of square: ");
//         int side = sc.nextInt();
//         Shape s = new Square(side);            // Shape reference -> Square object
//         System.out.println("Area of square is: " + s.area());

//         System.out.print("Enter length and breadth of rectangle: ");
//         int length = sc.nextInt();
//         int breadth = sc.nextInt();
//         s = new Rectangle(length, breadth);   // reuse reference variable
//         System.out.println("Area of rectangle is: " + s.area());

//         System.out.print("Enter radius of circle: ");
//         double radius = sc.nextDouble();
//         s = new Circle(radius);
//         System.out.println("Area of circle is: " + s.area());

//         // Demonstrate method overloading (compile-time polymorphism)
//         Calculator calc = new Calculator();
//         System.out.println("add(6,6,6) = " + calc.add(6, 6, 6));
//         System.out.println("add(6,6)   = " + calc.add(6, 6));
//         System.out.println("add(6.5,2.3) = " + calc.add(6.5, 2.3));

//         sc.close();
//     }
// }

//  Inheritance with Abstract Classes and Interfaces
// abstract class Animal {
//     abstract void sound(); 
//     void sleep(){
//         System.out.println("Animal is sleeping");
//     }
// }

//  interface Flyable {
//     void fly(); 
// }

//  interface Swimmable {
//     void swim();  
// }

// class Duck extends Animal implements Flyable, Swimmable {
//     @Override
//     void sound() {
//         System.out.println("Duck says: Quack Quack");
//     }

//     @Override
//     public void fly() {
//         System.out.println("Duck is flying");
//     }

//     @Override
//     public void swim() {
//         System.out.println("Duck is swimming");
//     }
// }

// class Dog extends Animal implements Swimmable {
//     @Override
//     void sound() {
//         System.out.println("Dog says: Woof Woof");
//     }

//     @Override
//     public void swim() {
//         System.out.println("Dog is swimming");
//     }

// }

// class Eagle extends Animal implements Flyable {
//     @Override
//     void sound() {
//         System.out.println("Eagle says: Screech");
//     }

//     @Override
//     public void fly() {
//         System.out.println("Eagle is flying");
//     }
// }

// public class Oops {
//     public static void main(String[] args) {
//         Dog myDog = new Dog();
//         myDog.sound(); 
//         myDog.sleep();
//         myDog.swim();

//         Duck myDuck = new Duck();
//         myDuck.sound();
//         myDuck.sleep();
//         myDuck.fly();
//         myDuck.swim();

//         Eagle myEagle = new Eagle();
//         myEagle.sound();    
//         myEagle.sleep();
//         myEagle.fly();

//     }
// }

// abstract class LibraryItem{
//     private String title;
//     private String author;
//     private String isbn;

// abstract void displayInfo();
    
// void setTitle(String title){
//         this.title=title;
//     }

//     String getTitle(){
//         return title;
//     }

//     void setAuthor(String author){
//         this.author=author;
//     }

//     String getAuthor(){
//         return author;
//     }

//     void setIsbn(String isbn){
//         this.isbn=isbn;
//     }

//     String getIsbn(){
//         return isbn;
//     }

// }

// interface Borrowable{
//     void borrowItem();
    
// }

// class Book extends LibraryItem implements Borrowable{
//     @Override
//     void displayInfo(){
//         System.out.println("Book Title: "+getTitle());
//         System.out.println("Book Author: "+getAuthor());
//         System.out.println("Book ISBN: "+getIsbn());
//     }
//     @Override
//     public void borrowItem(){
//         System.out.println("You have borrowed the book: "+getTitle());
//     }
// }
// class Magazine extends LibraryItem implements Borrowable{
//     @Override
//     void displayInfo(){
//         System.out.println("Magazine Title: "+getTitle());
//         System.out.println("Magazine Author: "+getAuthor());
//         System.out.println("Magazine ISBN: "+getIsbn());
//     }

//     @Override
//     public void borrowItem(){
//         System.out.println("You have borrowed the magazine: "+getTitle());
//     }
// }
// public class Oops {
//     public static void main(String[] args){
//       String[] books={"Boots Belts Berets","Mahabharata Unravelled","Balidan","The wings of fire","The Alchemist"};
//       String[] authors={"Tanushree podar","Ami Ganatra","Swapnil Pandey","A.P.J Abdul Kalam" , "Paulo Coelho"};
//         String[] isbns={"9780743273565","9780451524935","9780141439600","9780140449136","9780061122415"};

// LibraryItem[] library = new LibraryItem[books.length];

//         for (int i = 0; i < books.length; i++) {
//             Book b = new Book();
//             b.setTitle(books[i]);
//             b.setAuthor(authors[i]);
//             b.setIsbn(isbns[i]);
//             library[i] = b;
//         }

//     for (int i = 0; i < library.length; i++) {
//     library[i].displayInfo();
//     ((Borrowable) library[i]).borrowItem(); // call interface method
//     System.out.println();
// }

       
//     }
// }


// Mini Project: Library Management System (Console-based, OOP-centric)

