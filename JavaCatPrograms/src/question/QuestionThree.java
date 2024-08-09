package question;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];

        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Values stored in the array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Enter a number to search in the array:");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array.");
        }

        Arrays.sort(array);
        System.out.println("Array sorted in ascending order:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Elements of the new array in reverse order:");
        for (int value : reversedArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Enter a number to check if it is a palindrome:");
        int palindromeCheck = scanner.nextInt();
        if (isPalindrome(palindromeCheck)) {
            System.out.println(palindromeCheck + " is a palindrome.");
        } else {
            System.out.println(palindromeCheck + " is not a palindrome.");
        }

        int sum = 0;
        int product = 1;
        for (int value : array) {
            sum += value;
            product *= value;
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }
}
