package io_homework.partII;

import java.io.File;

public class Punctul9 {

    public static void main(String[] args) {
        File file = new File("src/main/resources/biathlonResults.csv");

        if (file.exists()) {
            System.out.println("The file size in byte is: " + fileSizeInBytes(file));
            System.out.println("The file size in kb is: " + fileSizeInKiloBytes(file));
            System.out.println("The file size in mb is: " + fileSizeInMegaBytes(file));
        } else {
            System.out.println("The file does not exist!");
        }
    }

    private static String fileSizeInBytes(File fileTest) {
        return fileTest.length() + " bytes";
    }
    private static String fileSizeInKiloBytes(File fileTest) {
        return (double) fileTest.length()/1024 + " kb";
    }
    private static String fileSizeInMegaBytes(File fileTest) {
        return (double) fileTest.length()/(1024*1024) + " mb";
    }
}
