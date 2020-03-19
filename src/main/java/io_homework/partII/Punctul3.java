package io_homework.partII;

import java.io.File;

public class Punctul3 {

    public static void main(String[] args) {
        File file = new File("D:/tema/");
        if (file.exists()) {
            System.out.println("File / directory exists!");
        } else {
            System.out.println("File / directory does not exist!");
        }
    }
}
