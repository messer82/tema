package intro_to_java;

import java.util.Scanner;

//Display the smallest number from an array of number (2 versions: with normal for and with foreach)

public class SmallestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please advise how many elements will the array contain: ");
        int x =scanner.nextInt();
        int[] myArray = new int[x];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Please input the elements of the array: ");
            myArray[i] =scanner.nextInt();
            int minimum = myArray[0];
            if (myArray[i]<myArray[0]) {
                myArray[0]=myArray[i];
            }
        }
        System.out.println("The smallest number of the array is: " + myArray[0]);
    }
}
