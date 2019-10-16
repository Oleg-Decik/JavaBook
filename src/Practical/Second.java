package Practical;
import java.util.Scanner;
public class Second {
	public static void SecondTask(){
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Enter the day number: ");
		int dayNumber = scanner.nextInt ();
		switch (dayNumber){
			case 1:
				System.out.println ("Monday, Понеділок, Lundi");
				break;
			case 2:
				System.out.println ("Tuesday, Вівторок, Mardi");
				break;
			case 3:
				System.out.println ("Wednesday, Середа, Mercredi");
				break;
			case 4:
				System.out.println ("Thursday, Четвер, Jeudi");
				break;
			case 5:
				System.out.println ("Friday, П'ятниця, Vendredi");
				break;
			case 6:
				System.out.println ("Saturday, Субота, Samedi");
				break;
			case 7:
				System.out.println ("Sunday, Неділя, Dimanche");
				break;
			default:
				System.out.println ("You entered wrong Day Number");
		}
	}
}
