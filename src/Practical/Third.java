package Practical;
import com.company.ContinentEnum;
import java.util.Scanner;

public class Third {
	public static void ThirdTask () {
		ContinentEnum.Continent continentEnum;
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Enter the country: ");
		String country = scanner.nextLine ();
		switch (country) {
			case "Ukraine": case "Russia": case "Poland":
				continentEnum = ContinentEnum.Continent.EUROPE;
				System.out.println (continentEnum);
				break;
			case "Bermuda": case "Canada": case "Cuba":
				continentEnum = ContinentEnum.Continent.NORTHAMERICA;
				System.out.println (continentEnum);
				break;
			case "Argentina": case  "Brazil": case "Peru":
				continentEnum = ContinentEnum.Continent.SOUTHAMERICA;
				System.out.println (continentEnum);
				break;
			case "Egypt": case "Libya": case "Algeria":
				continentEnum = ContinentEnum.Continent.AFRICA;
				System.out.println (continentEnum);
				break;
			case "China": case "Turkey": case "Iran":
				continentEnum = ContinentEnum.Continent.ASIA;
				System.out.println (continentEnum);
				break;
			case "Australia":
				continentEnum = ContinentEnum.Continent.AUSTRALIA;
				System.out.println (continentEnum);
				break;
			default:
				System.out.println ("Country doesn`t exist");
		}
	}
}
