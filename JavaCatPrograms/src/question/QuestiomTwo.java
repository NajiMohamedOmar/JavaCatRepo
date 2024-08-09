package question;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestiomTwo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Palindrome Checker");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter a number:");
        label.setBounds(50, 30, 150, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(200, 30, 150, 30);
        frame.add(textField);

        JButton button = new JButton("Check");
        button.setBounds(150, 80, 100, 30);
        frame.add(button);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(50, 120, 300, 30);
        frame.add(resultLabel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                try {
                    int number = Integer.parseInt(input);
                    if (isPalindrome(number)) {
                        resultLabel.setText(number + " is a palindrome.");
                    } else {
                        resultLabel.setText(number + " is not a palindrome.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid number.");
                }
            }
        });

        frame.setVisible(true);
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

