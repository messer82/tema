package io_homework.partII;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Punctul16 {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/streamAndLambdaInTest.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

        String testAppendFile = "Adaugam la final";

        try {
            writer.write(testAppendFile);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.close();
    }
}
