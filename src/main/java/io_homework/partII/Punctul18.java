package io_homework.partII;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Punctul18 {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/streamAndLambdaInTest.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<String> wordList = new ArrayList<>();

        try {
            String line = reader.readLine();
            while (line != null) {
                wordList.addAll(Arrays.asList(line.replaceAll("[^a-zA-Z |s]+", "").split(" ")));
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
        System.out.println(wordList);

//        sortare in ordine alfabetica a celor mai lungi cuvinte (daca sunt mai multe de aceeasi lungime)
        Collections.sort(wordList);
        wordList.sort((w1, w2) -> w2.length() - w1.length());

        System.out.println(wordList.get(0));

    }
}
