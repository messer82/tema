package io_homework.partII;

import java.io.*;

public class Punctul17 {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/streamAndLambdaInTest.txt");

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;

        try {
            for (int i = 0; i < 3; i++) {
                    line = reader.readLine();
//                    System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
    }
}
