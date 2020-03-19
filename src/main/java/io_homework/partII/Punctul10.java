package io_homework.partII;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Punctul10 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/biathlonResults.csv");
        byte[] byteArray = Files.readAllBytes(path);
        System.out.println(Arrays.toString(byteArray));
    }
}
