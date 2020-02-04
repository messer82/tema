package oop_homework_2.punctul1;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class JavaString {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] c = new int[26];
        int[] d = new int[26];

        a = a.toUpperCase();
        b = b.toUpperCase();

        for (int i = 0; i < a.length(); i++) {
            c[a.charAt(i)]++;
            d[b.charAt(i)]++;
        }
        for (int j = 0; j < 26; j++)
            if (c[j] != d[j])
                return false;
        return true;


        // Complete the function
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
