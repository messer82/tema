package OOP_homework;

import java.util.Scanner;

public class NumberCompareR {
    static void compareNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please advise how many elements will the array contain: ");
        int x = scanner.nextInt();
        int[] myArray = new int[x];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Please input the elements of the array: ");
            myArray[i] = scanner.nextInt();
            int minimum = myArray[0];
            if (myArray[i] < myArray[0]) {
                myArray[0] = myArray[i];
            }
        }
        System.out.println("The smallest number of the array is: " + myArray[0]);

    }
}