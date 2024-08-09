package section2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        try (Scanner question5 = new Scanner(System.in)) {
			System.out.print("Enter the first number: ");
			double num1 = question5.nextDouble();

			System.out.print("Enter an operation (+, -, *, /): ");
			char operation = question5.next().charAt(0);

			System.out.print("Enter the second number: ");
			double num2 = question5.nextDouble();

			double result = 0;
			boolean validOperation = true;

			switch (operation) {
			    case '+':
			        result = num1 + num2;
			        break;
			    case '-':
			        result = num1 - num2;
			        break;
			    case '*':
			        result = num1 * num2;
			        break;
			    case '/':
			        if (num2 != 0) {
			            result = num1 / num2;
			        } else {
			            System.out.println("Error: Division by zero is not allowed.");
			            validOperation = false;
			        }
			        break;
			    default:
			        System.out.println("Error: Invalid operation.");
			        validOperation = false;
			        break;
			}

			if (validOperation) {
			    System.out.println("The result of the operation is: " + result);
			}
		}
    }
}

