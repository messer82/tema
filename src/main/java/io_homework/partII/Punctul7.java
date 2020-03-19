package io_homework.partII;

import java.io.File;
import java.util.Date;

public class Punctul7 {

    public static void main(String[] args) {
        File file = new File("D:/tema/");

        Date date = new Date(file.lastModified());
        System.out.println("The file was last modified at: " + date);
    }
}
