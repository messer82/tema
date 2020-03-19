package io_homework.partII;

import java.io.*;

public class Punctul11 {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/biathlonResults.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line = reader.readLine();
        while (line != null) {
            line = reader.readLine();
        }
        reader.close();
    }
}
