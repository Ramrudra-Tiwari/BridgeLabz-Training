package com.constructorandaccessmodifiers.level1;

public class ProductInventory {
	
	 String productName;
	 int price;
	 static int totalProducts;
	 ProductInventory(String productName, int price){
		 this.productName = productName;
		 this.price = price;
		 totalProducts++;
	 }
	 void displayProductDetails() {
		 System.out.println("Product Name: " + productName);
		 System.out.println("Price: " + price);
	 }
	 static void displayTotalProducts() {
		 System.out.println("Total products: " + totalProducts);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductInventory product1 = new ProductInventory("Cup",20);
		ProductInventory product2 = new ProductInventory("Tea",34);
		product1.displayProductDetails();
		product2.displayProductDetails();
		ProductInventory.displayTotalProducts();
	}

}
