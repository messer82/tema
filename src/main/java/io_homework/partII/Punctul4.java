package io_homework.partII;

import java.io.File;

public class Punctul4 {

    public static void main(String[] args) {
        File file = new File("D:/tema/");

        if (file.canRead()) {
            System.out.println("File / directory has read permission!");
        } else {
            System.out.println("File / directory does not have read permission!");
        }

        if (file.canWrite()) {
            System.out.println("File / directory has write permission!");
        } else {
            System.out.println("File / directory does not have write permission!");
        }
    }
}
