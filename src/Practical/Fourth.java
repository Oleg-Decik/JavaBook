package Practical;

public class Fourth {
	public static void  FourthTask(){
		Product watches = new Product ("Roleks", 14000, 1);
		Product car = new Product ("BMW", 130000, 1);
		Product phone = new Product ("iPhone 11 pro", 31000, 2);
		Product shoe = new Product ("Nike", 890011111, 3);

		System.out.println (Product.max_price);
		System.out.println (Product.max_quant);
		Product.Display_Name_Price ();
		Product.Biggest_Quantity ();
	}
}
