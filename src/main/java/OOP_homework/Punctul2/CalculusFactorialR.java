package OOP_homework.Punctul2;

import java.util.Scanner;

public class CalculusFactorialR {
    static void factorialNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the number to calculate factorial: ");
        int n = scanner.nextInt();

        int a = 1;

        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        System.out.println("The factorial of " + n + " is: " + a);
    }
}