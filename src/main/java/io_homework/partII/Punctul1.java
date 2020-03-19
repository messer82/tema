package io_homework.partII;

import java.io.File;

public class Punctul1 {

    public static void main(String[] args) {
        File file = new File("D:/tema/"); //sau orice alt fisier / folder
        String[] fileNames = file.list();
        for (String name : fileNames) {
            System.out.println(name);
        }
    }
}
