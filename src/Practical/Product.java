package Practical;

import java.util.ArrayList;
import java.util.List;

public class Product {
	public String name;
	public int price;
	public int quantity;
	static int max_price;
	static int max_quant;
	static Product refQ;
	static Product refP;

	public Product (String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;

		if (price > max_price) {
			Product.max_price = price;
			Product.refP = this;
		}
		if (quantity >= Product.max_quant) {
			Product.max_quant = quantity;
			Product.refQ=this;
		}
	}

	public static void Display_Name_Price() {
			System.out.println (refP.name + " " + refP.price);
	}
	public static void Biggest_Quantity () {
			System.out.println (refQ.name + " " + refQ.quantity);


	}
}