package Task3;

import java.util.Scanner;

public class Gradecalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of grades:- ");
		int numgrades = sc.nextInt();

		if (numgrades <= 0) {
			System.out.println("Invalid number of grades");
			sc.close();
			return;
		}
		double[] grades = new double[numgrades];

		for (int i = 0; i < numgrades; i++) {
			System.out.print("Enter grade:-");
			grades[i] = sc.nextDouble();
			if (grades[i] <= 0) {
				System.out.println("Invalid Grade");
				sc.close();
				return;
			}
		}

		double sum = 0;
		for (double grade : grades) {
			sum += grade;
		}

		double average = sum / numgrades;

		System.out.println("Average grade is:-" + average);

		sc.close();
	}
}