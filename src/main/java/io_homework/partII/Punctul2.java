package io_homework.partII;

import java.io.File;
import java.io.FilenameFilter;

public class Punctul2 {

    public static void main(String[] args) {
        File file = new File("D:/tema/");
        String[] fileByExtension = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".exe")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
    }
}
