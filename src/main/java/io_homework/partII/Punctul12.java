package io_homework.partII;

import java.io.*;

// nu inteleg diferenta intre asta si punctul 11.
// Poate este ceva ce mi-a scapat, si te rog sa imi dai un semn cu ce ar fi trebuit sa fac (daca trebuia sa fac altceva).
public class Punctul12 {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/streamAndLambdaIn.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        try {
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
    }
}
