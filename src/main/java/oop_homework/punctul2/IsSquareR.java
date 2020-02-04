package oop_homework.punctul2;

import java.util.Arrays;
import java.util.Scanner;

public class IsSquareR {
    static void checkSquare() {
        System.out.println("The array is square: " + isSquare());
    }

    public static boolean isSquare() {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        System.out.println("Please input the number of elements of the first array: ");
        m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Please input the elements of the first array: ");
            b[i] = scanner.nextInt();
        }
        System.out.println("Please input the number of elements of the second array: ");
        n = scanner.nextInt();
        int[] c = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("Please input the elements of the second array: ");
            c[j] = scanner.nextInt();
        }
        int[][] a = new int[][] {b,c};
        System.out.println("The arrays list is: " + Arrays.deepToString(a));

        int x = b.length;
        int y = c.length;

        if (x == y) {
            return true;
        }
        else {
            return false;
        }

    }

}
