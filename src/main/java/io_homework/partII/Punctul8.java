package io_homework.partII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punctul8 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the name of this class: ");
        String thisClassName = reader.readLine();
        System.out.println(thisClassName);
    }
}
