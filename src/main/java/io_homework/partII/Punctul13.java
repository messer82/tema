package io_homework.partII;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Punctul13 {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/streamAndLambdaIn.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<String> linesList = new LinkedList<>();

        try {
            String line = reader.readLine();
            while (line != null) {
                linesList.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();

        for (String s : linesList) {
            System.out.println(s);
        }
    }
}
