package oop_homework.punctul2;

import java.util.Scanner;

public class NumberCheck {

    private static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    static void primeNumberCheck() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println("The prime numbers smaller than " + number + " are: " + i);
            }
        }
    }
}
