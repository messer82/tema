package java_8_homework.punctul1;

import java.util.Arrays;
import java.util.stream.Stream;

//Write a method that can generate the first 100 numbers from Fibonacci series using Java 8 streams which returns the sequence as an array of int.

public class Fibonacci {

    public static void main(String[] args) {
//        int[] fibonacciArray = new int[100];
//        fibonacciArray[0] = 0;
//        fibonacciArray[1] = 1;
//        for (int i = 2; i < 100; i++) {
//            fibonacciArray[i] = fibonacciArray[i - 2] + fibonacciArray[i - 1];
//        }
//        Arrays.stream(fibonacciArray).forEachOrdered(System.out::println);

        Stream.iterate(new int[] {0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(100)
                .map(f -> f[0])
                .forEach(System.out::println);
    }
}
