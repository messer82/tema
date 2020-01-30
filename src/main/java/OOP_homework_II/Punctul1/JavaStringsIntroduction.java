package OOP_homework_II.Punctul1;
import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] chunks = s.split("(?<=\\G.{3})");

        System.out.println(chunks.toString());

        for (int i = 0; i <= chunks.length; i++){
            if (chunks[i].charAt(0) <= chunks[i+1].charAt(0)) {
                smallest = chunks[i];
            }
            return smallest;
        }

        for (int j = 0; j <= chunks.length; j++) {
            if (chunks[j].charAt(0) >= chunks[j+1].charAt(0)) {
                largest = chunks[j];
            }
            return largest;
        }

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
