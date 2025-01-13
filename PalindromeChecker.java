package Task2;

import java.util.Scanner;

public class PalindromeChecker {

	public static boolean isPalindrome(String str) {
		String cleanStr = str.replaceAll("\\s+", "").toLowerCase();

		String reversedStr = reverseString(cleanStr);

		return cleanStr.equals(reversedStr);
	}

	public static String reverseString(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter string:- ");
		String input = scanner.nextLine();

		if (isPalindrome(input)) {
			System.out.println("Input is palindrome");
		} else {
			System.out.println("Input is not  palindrome");
		}

		scanner.close();
	}
}