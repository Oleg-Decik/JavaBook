package Practical;
import java.util.Scanner;
public class First {
	public static void FirstTask() {
		Scanner scanner = new Scanner (System.in);
		int digit;

		for (int i = 0 ; i < 1 ; i++){
			for (int j = 0; j < 3 ; j++) {
				System.out.println ("Please enter digit: ");
				digit = scanner.nextInt ();

				if (digit % 2 == 0) {
					System.out.printf ("%d is odd\n", digit);
				} else {
					System.out.printf ("%d is not odd\n", digit);
				}
			}
		}
	}
}
