package OOP_homework.Punctul2;

import java.util.Scanner;

public class AdderSum100 {

    static void makeSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number for which you want to calculate the sum: ");
        int x = scanner.nextInt();

        int a = 0;

        for (int i = 1; i <= x; i++)
            a = a + i;

        System.out.println("The sum of the first " + x + " numbers is: " + a);
    }
}