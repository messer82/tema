package oop_homework.punctul2;

import java.util.Scanner;

public class PalindromCheckR {
    static void palindromReverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number to be verified: ");
        int number = scanner.nextInt();
        int x, reverse = 0;
        int a = number;

        while (a != 0) {
            x = a % 10;
            reverse = reverse * 10 + x;
            a = a / 10;
        }
        if (reverse == number)
            System.out.println("The number is a palindrome!");
        else
            System.out.println("The number is not a palindrome!");
    }
}