// Mini Project: Online Food Ordering System (Console-based)

import java.util.*;

 class Mini {
    abstract class MenuItem{
        private String name;
        private double basePrice;

         MenuItem(String name, double basePrice) {
            this.name = name;
            this.basePrice = basePrice;
        }
        public String getName(){
            return name;
        }
        public double getBasePrice(){
            return basePrice;
        }

        abstract double calculatePrice();
        

    }
     class Pizza extends MenuItem{
        String size;
           Pizza(String name, double basePrice, String size) {
            super(name, basePrice);
            this.size = size;
        }
        public String getSize(){
            return size;
        }
        
        double calculatePrice(){
            double finalPrice= getBasePrice();
            if (size=="Medium"){
                finalPrice +=90;
            }
            else if(size=="Large"){
                finalPrice +=120;
            }
            else{
                finalPrice +=55;
            }
return finalPrice;
        }
     
    }   

    class Burger extends MenuItem{
        boolean cheese;
        Burger(String name, double baseprice, boolean cheese){
            super(name, baseprice);
            this.cheese = cheese;
        }
        double calculatePrice(){
            double finalPrice= getBasePrice();
            if (cheese){
                return finalPrice + 30;}
                else{
                    return finalPrice;
                }
            }
        }

        class Customer{}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         pizza = new Mini(). new Pizza("Veggie Delight", 200, "Large");
    }
}