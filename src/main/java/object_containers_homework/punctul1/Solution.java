package object_containers_homework.punctul1;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<int[]> list = new ArrayList<>();

//        System.out.println("nr linii");
        int numberOfLines = scanner.nextInt();
        for (int i = 0; i < numberOfLines; i++) {
//            System.out.println("nr elemente array");
            int numberOfElements = scanner.nextInt();
            int[] myArray = new int[numberOfElements];
            for (int j = 0; j < numberOfElements; j++) {
//                System.out.println("elemente array");
                myArray[j] = scanner.nextInt();
            }
            list.add(myArray);

        }
//        System.out.println("nr liniei");
        int n = scanner.nextInt();
        int[] arrayTest = list.get(n - 1);
//        System.out.println("elementul de afisat");
        int e = scanner.nextInt();
        System.out.println(arrayTest[e - 1]);

        if (e - 1 > arrayTest.length) {
            System.out.println("ERROR!");
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
