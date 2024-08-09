package question;

public class QuestionOne {
    public static void main(String[] args) {
        int limit = 4000000;
        System.out.println("Sum of even-valued Fibonacci terms: " + sumEvenFibonacci(limit));
    }

    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int a = 1;
        int b = 2;

        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }
            int next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }
}

