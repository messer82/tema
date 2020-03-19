package io_homework.partII;

import java.io.File;

public class Punctul5 {

    public static void main(String[] args) {
        File file = new File("D:/tema/");

        if (file.isFile()) {
            System.out.println("The pathname is a file!");
        } else if (file.isDirectory()){
            System.out.println("The pathname is a directory!");
        }
    }
}
