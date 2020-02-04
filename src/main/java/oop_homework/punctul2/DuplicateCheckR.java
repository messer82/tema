package oop_homework.punctul2;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCheckR {
    static void checkForDuplicate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number of elements of the array: ");
        int x = scanner.nextInt();
        int[] myArray = new int[x];

        for (int j = 0; j < x; j++) {
            System.out.println("Please input the elements of the array: ");
            myArray[j] = scanner.nextInt();
        }

        System.out.println("The array elements are: " + Arrays.toString(myArray));

        int p, q, temp;
        for (p = 0; p < x; p++) {
            for (q = p + 1; q < x; q++) {
                if (myArray[p] > myArray[q]) {
                        temp = myArray[p];
                        myArray[p] = myArray[q];
                        myArray[q] = temp;
                }
            }
        }

        int n = 1;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != myArray[n - 1]) {
                myArray[n++] = myArray[i];
            }
        }
        System.out.println("The array length of unique elements is: " + n);

    }
}