import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter temperature value:- ");
		double temperature = sc.nextDouble();

		System.out.print("Enter unit of measurement C for Celsius and F for Fahrenheit:- ");
		String unit = sc.next();

		double convertedtemp;
		if (unit.equalsIgnoreCase("C")) {
			convertedtemp = (temperature * 9 / 5) + 32;
			System.out.println("Temperature in Fahrenheit is:- " + convertedtemp + "F");
		} else if (unit.equalsIgnoreCase("F")) {
			convertedtemp = (temperature - 32) * 5 / 9;
			System.out.println("Temperature in Celsius is:- " + convertedtemp + "C");
		} else {
			System.out.println("Invalid unit");
		}

		sc.close();
	}
}
