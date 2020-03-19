package io_homework.partII;

import java.io.File;

public class Punctul6 {

    public static void main(String[] args) {
        File file1 = new File("src/main/resources/streamAndLambdaIn.txt");
        File file2 = new File("src/main/resources/streamAndLambdaOut.txt");

        int difference = file1.compareTo(file2);

        System.out.println("file1 compared to file2: " + difference);
    }
}
