package io_homework.punctul1;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BiathlonPlacing {

    public static void main(String[] args) throws IOException {
        List<RaceResult> raceResults = new LinkedList<>();
        List<RaceResult> raceStandings = new LinkedList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm:ss");
        File file = new File("src/main/resources/biathlonResults.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        try {
            reader.readLine();
            String line = reader.readLine();
            while (line != null) {
                String[] lineChunks = line.trim().split(",");
                line = reader.readLine();
                String penalty = lineChunks[4].replaceAll("x", "")
                        .concat(lineChunks[5].replaceAll("x", ""))
                        .concat(lineChunks[6].replaceAll("x", ""));
                int penaltySeconds = penalty.length() * 10;
                raceResults.add(new RaceResult(Integer.parseInt(lineChunks[0]), lineChunks[1], lineChunks[2], LocalTime.parse(lineChunks[3], formatter), lineChunks[4], lineChunks[5], lineChunks[6]));
                raceStandings.add(new RaceResult(Integer.parseInt(lineChunks[0]), lineChunks[1], lineChunks[2], LocalTime.parse(lineChunks[3], formatter).plusSeconds(penaltySeconds), lineChunks[4], lineChunks[5], lineChunks[6]));
            }
        } catch (DateTimeException e) {
            System.out.println(e);
        }
        raceStandings.sort(Comparator.comparing(RaceResult::getSkiTimeResult));

        System.out.println("Winner - " + raceStandings.get(0).getAthleteName() +
                " " + raceStandings.get(0).getSkiTimeResult() +
                " (" + raceStandings.get(0).getSkiTimeResult() +
                " + " + (raceStandings.get(0).getFirstShootingRange().concat(raceStandings.get(0).getSecondShootingRange().concat(raceStandings.get(0).getThirdShootingRange())).replaceAll("x", "").length() * 10) +
                ")");
        System.out.println("Runner-up - " + raceStandings.get(1).getAthleteName() +
                " " + raceStandings.get(1).getSkiTimeResult() +
                " (" + raceStandings.get(1).getSkiTimeResult() +
                " + " + (raceStandings.get(1).getFirstShootingRange().concat(raceStandings.get(1).getSecondShootingRange().concat(raceStandings.get(1).getThirdShootingRange())).replaceAll("x", "").length() * 10) +
                ")");
        System.out.println("Third Place - " + raceStandings.get(2).getAthleteName() +
        " " + raceStandings.get(2).getSkiTimeResult() +
                " (" + raceStandings.get(2).getSkiTimeResult() +
                " + " + (raceStandings.get(2).getFirstShootingRange().concat(raceStandings.get(2).getSecondShootingRange().concat(raceStandings.get(2).getThirdShootingRange())).replaceAll("x", "").length() * 10) +
                ")");

//        for (RaceResult r : raceResults) {
//            System.out.println(r);
//        }
//
//        for (RaceResult r1 : raceStandings) {
//            System.out.println(r1);
//        }
    }
}
