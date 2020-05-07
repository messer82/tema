package intro_to_java;

import java.util.Scanner;

//Change the implementation of the calculator from the previous meeting to not stop after one calculation. (Hint: put switch inside a while loop)

public class ContinuousCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number and press enter: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number and press enter: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter operator and press enter: ");
        String operator = scanner.next();

        double result;
        while (!operator.equals("stop")){
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

            System.out.println("Enter operator and press enter: ");
            operator = scanner.next();
        }

    }

}
