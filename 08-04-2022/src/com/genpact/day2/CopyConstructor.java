package com.genpact.day2;

class Product{
	String name;
	int price;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	Product(Product p){
		this.name = p.name;
		this.price = p.price;
	}
	
	void display() {
		System.out.println("Products : "+name+"  "+price);
	}
}

public class CopyConstructor {
	
	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 700000);
		Product p2 = new Product(p1);
		p1.display();
		p2.display();
	}
	

}
