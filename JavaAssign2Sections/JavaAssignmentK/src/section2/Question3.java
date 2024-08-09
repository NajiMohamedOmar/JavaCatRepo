package section2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        try (
		Scanner question3 = new Scanner(System.in)) {
			System.out.print("Please enter an integer: ");
			int number = question3.nextInt();

			for (int i = 1; i <= 9; i++) {
			    if (number % i == 0) {
			        System.out.println("The number " + number + " is divisible by " + i + ".");
			        if (i == 5 && (number % 10 == 0 || number % 10 == 5)) {
			            System.out.println("The number " + number + " is divisible by 5 because it ends with " + (number % 10) + ".");
			        }
			    }
			}
		}
    }
}
