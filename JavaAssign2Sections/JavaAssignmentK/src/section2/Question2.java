package section2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner question2 = new Scanner(System.in);

        double[] marks = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter the marks for unit " + (i + 1) + ": ");
            marks[i] = question2.nextDouble();
        }

        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        double average = total / 5;

        System.out.printf("The average mark is: %.2f", average);
    }
}
