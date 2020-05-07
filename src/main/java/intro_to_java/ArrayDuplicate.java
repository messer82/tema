package intro_to_java;

//Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
//        Sample array: [20, 20, 30, 40, 50, 50, 50]
//        After removing the duplicate elements the program should return 4 as the new length of the array.

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] myArray = {20, 20, 30, 40, 50, 50, 50};
        int n = 1;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != myArray[n - 1]) {
                myArray[n++] = myArray[i];
            }
        }
        System.out.println("The array length of unique elements is: " + n);
    }
}

