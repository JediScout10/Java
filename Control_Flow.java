

// public class Control_Flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         System.out.print("Enter your name: ");
//         String name = sc.next(); // single word
//         // String name = sc.nextLine(); // full line

//         System.out.println("Hello " + name + ", your age is " + age);

//         sc.close();
//         int a = age;

//         if (a >= 18) {
//             System.out.println("You are an adult.");
//         } else {
//             System.out.println("You are a minor.");
//         }

//     }
// }

// public class Control_Flow {
//     static int maxOfTwo(int a, int b) {
//         if (a>b) {
//             return a;
//         } else {
//             return b;
//         }


//     }
//     public static void main(String[] args) {
//         int a=maxOfTwo(10, 5);
//         System.out.println(a);

     
//     }
// }       

// public class Control_Flow {
//     static boolean isEven(int a) {
//         return(a%2==0) ? true : false;
//     }
//     public static void main(String[] args) {
//         boolean a=isEven(10);
//         System.out.println(a);
//     }}
     
    public class Control_Flow {
        static int sum(int n) {
            int sum=0;
            for (int i=1; i<=n; i++) {
                sum+=i;
            }
            return sum;
        }
        public static void main(String[] args) {
            int a=sum(5);
            System.out.println(a);
        }}