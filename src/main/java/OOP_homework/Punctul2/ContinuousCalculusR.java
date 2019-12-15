package OOP_homework.Punctul2;

import java.util.Scanner;

public class ContinuousCalculusR {
    static void makeCalculus() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number and press enter: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number and press enter: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter operator and press enter: ");
        String operator = scanner.next();

        double result;

        while (!operator.equals("STOP")) {
            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Semnul introdus nu e valid");
                    return;
            }
            System.out.println("The result of " + firstNumber + " " + operator + " " + secondNumber + " is: " + result);

            System.out.println("Enter first number and press enter: ");
            firstNumber = scanner.nextDouble();

            System.out.println("Enter second number and press enter: ");
            secondNumber = scanner.nextDouble();

            System.out.println("Enter operator and press enter / If you want to stop calculator type STOP: ");
            operator = scanner.next();
        }

    }
}