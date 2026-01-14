package rvt;

import java.util.Scanner;

public class connecticut_100 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the numerator: ");
            String inputNum = reader.nextLine();

            if (inputNum.charAt(0) == 'q' || inputNum.charAt(0) == 'Q') {
                System.out.println();
                break;
            }
            try {

                int num = Integer.valueOf(inputNum);

                System.out.print("Enter the divisor: ");
                int div = Integer.valueOf(reader.nextLine());

                System.out.print(num + " / " + div + " is " + num / div);
                System.out.println();
                System.out.println();
            } catch (ArithmeticException e) {

                System.out.println("Division " + inputNum + " by zero is not allowed.");
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("You entered invalid number.");
                System.out.println("Please try again.");
                System.out.println();
            }
        }
        reader.close();
    }
}