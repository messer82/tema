package io_homework.punctul1;

import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BiathlonPlacing {

    public static void main(String[] args) throws IOException {
        List<RaceResult> raceResults = new LinkedList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        File file = new File("src/main/resources/biathlonResults.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.readLine();
        String line = reader.readLine();
        while (line != null) {
            String[] lineChunks = line.trim().split(",");
            line = reader.readLine();
            raceResults.add(new RaceResult(Integer.parseInt(lineChunks[0]), lineChunks[1], lineChunks[2], LocalTime.parse(lineChunks[3], formatter), lineChunks[4], lineChunks[5], lineChunks[6]));
            for (String s : lineChunks) {
                System.out.println(s);
            }
            System.out.println(raceResults);
        }

    }
}
