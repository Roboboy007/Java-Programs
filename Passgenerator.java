package Task4;

import java.util.Random;
import java.util.Scanner;

public class Passgenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		StringBuilder password = new StringBuilder();

		System.out.print("Enter length of the password: ");
		int length = sc.nextInt();

		if (length == 0) {
			System.out.println("No zero length password");
			sc.close();
			return;
		}

		System.out.println("Enter choice in the form of Y for yes and N for no");

		System.out.print("special character? (y/n): ");
		String includeSpecialStr = sc.next();
		boolean includeSpecial = includeSpecialStr.equalsIgnoreCase("y");

		System.out.print("lowercase letter? (y/n): ");
		String includeLowercaseStr = sc.next();
		boolean includeLowercase = includeLowercaseStr.equalsIgnoreCase("y");

		System.out.print("number? (y/n): ");
		String includeNumbersStr = sc.next();
		boolean includeNumbers = includeNumbersStr.equalsIgnoreCase("y");

		System.out.print("uppercase letter? (y/n): ");
		String includeUppercaseStr = sc.next();
		boolean includeUppercase = includeUppercaseStr.equalsIgnoreCase("y");

		String characters = "";

		if (includeNumbers) {
			characters += "0123456789";
		}
		if (includeLowercase) {
			characters += "abcdefghijklmnopqrstuvwxyz";
		}
		if (includeUppercase) {
			characters += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		}
		if (includeSpecial) {
			characters += "!@#$%^&*()_+-=[]{};':\",.<>/?";
		}

		if (characters.length() == 0) {
			System.out.println("You can't have empty password");
			sc.close();
			return;
		}

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			password.append(characters.charAt(index));
		}

		System.out.println("Password is : " + password.toString());
		sc.close();
	}
}