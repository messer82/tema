package intro_to_java;

import java.util.Scanner;

//Display the max digit from a number.

public class MaxDigit {
    public static void main(String[] args) {
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
