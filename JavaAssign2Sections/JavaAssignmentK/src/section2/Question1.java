package section2;

import java.util.Scanner;

	public class Question1 {
	    public static void main(String[] args) {
	        try (
			Scanner scanner = new Scanner(System.in)) {
				System.out.print("Please enter your surname: ");
				String surname = scanner.nextLine();

				System.out.print("Please enter your current age: ");
				int age = scanner.nextInt();

				int surnameLength = surname.length();

				String ageEvenOrOdd = (age % 2 == 0) ? "even" : "odd";

				System.out.println("The number of characters in your surname is " + surnameLength + ".");
				System.out.println("Your current age is an " + ageEvenOrOdd + " number.");
			}
	    }
	}

