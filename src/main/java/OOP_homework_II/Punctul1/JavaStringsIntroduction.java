package OOP_homework_II.Punctul1;
import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(s.indexOf(k));
        String largest = "";


        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "welcometojava";
        int k = 3;

        System.out.println(getSmallestAndLargest(s, k));

}
}
