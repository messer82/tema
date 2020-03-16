package java_8_homework;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        int[] fibonacciArray = new int[100];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i < 100; i++) {
            fibonacciArray[i] = fibonacciArray[i - 2] + fibonacciArray[i - 1];
        }
        Arrays.stream(fibonacciArray).forEachOrdered(System.out::println);
    }
}
