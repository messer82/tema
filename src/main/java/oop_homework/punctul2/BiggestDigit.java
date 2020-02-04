package oop_homework.punctul2;

import java.util.Scanner;

public class BiggestDigit {

    static void checkMaxDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int x = scanner.nextInt();
        int y, z=0;

        while (x>0) {
            y = x%10;
            if (z<y) {
                z=y;
            }
            x = x/10;
        }
        System.out.println("The maximum digit of a number is: " + z);
    }
}
