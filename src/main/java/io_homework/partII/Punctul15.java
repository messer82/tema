package io_homework.partII;

import java.io.*;

public class Punctul15 {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/streamAndLambdaIn.txt");
        File file1 = new File("src/main/resources/streamAndLambdaInTest.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file1, false));

        try {
            String line = reader.readLine();
            while (line != null) {
                writer.write(line);
                writer.newLine();
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
        writer.close();
    }
}
