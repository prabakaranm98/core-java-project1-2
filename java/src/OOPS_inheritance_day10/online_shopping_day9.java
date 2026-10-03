package OOPS_inheritance_day10;

//Parent class
class Product {
 int productId;
 String productName;
 double price;

 Product(int productId, String productName, double price) {
     this.productId = productId;
     this.productName = productName;
     this.price = price;
 }

 void displayProductDetails() {
     System.out.println("Product ID   : " + productId);
     System.out.println("Product Name : " + productName);
     System.out.println("Price        : " + price);
 }
}

//Child class 1 - Electronics
class Electronics extends Product {
 String warranty;

 Electronics(int productId, String productName, double price, String warranty) {
     super(productId, productName, price);
     this.warranty = warranty;
 }

 void displayDetails() {
     displayProductDetails();
     System.out.println("Category     : Electronics");
     System.out.println("Warranty     : " + warranty);
     System.out.println("----------------------------");
 }
}

//Child class 2 - Clothing
class Clothing extends Product {
 String size;

 Clothing(int productId, String productName, double price, String size) {
     super(productId, productName, price);
     this.size = size;
 }

 void displayDetails() {
     displayProductDetails();
     System.out.println("Category     : Clothing");
     System.out.println("Size         : " + size);
     System.out.println("----------------------------");
 }
}

//Child class 3 - Food
class Food extends Product {
 String expiryDate;

 Food(int productId, String productName, double price, String expiryDate) {
     super(productId, productName, price);
     this.expiryDate = expiryDate;
 }

 void displayDetails() {
     displayProductDetails();
     System.out.println("Category     : Food");
     System.out.println("Expiry Date  : " + expiryDate);
     System.out.println("----------------------------");
 }
}

//Main class
public class online_shopping_day9 {

	public static void main(String[] args) {
		 // Electronics object
        Electronics e = new Electronics(
                101, "Laptop", 55000, "2 Years"
        );

        // Clothing object
        Clothing c = new Clothing(
                102, "T-Shirt", 999, "L"
        );

        // Food object
        Food f = new Food(
                103, "Chocolate", 250, "30-12-2026"
        );

        System.out.println("===== ONLINE SHOPPING =====");

        e.displayDetails();
        c.displayDetails();
        f.displayDetails();
    }
}