package final_quizz.punctul1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CourierApp {

    public static void main(String[] args) throws IOException {

        List<Package> packageList = new LinkedList<>();

        PackageToGroup packageToGroup = new PackageToGroup(packageList);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        File file = new File("src/main/resources/quizz.csv");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        try{
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] lineChunks = line.trim().split(",");
                line = bufferedReader.readLine();
                packageList.add(new Package(lineChunks[0], Integer.parseInt(lineChunks[1]), Integer.parseInt(lineChunks[2]), LocalDate.parse(lineChunks[3], dateTimeFormatter)));
            }
        } catch (DateTimeException e) {
            e.printStackTrace();
        }

        PackageGroupThread packageGroupThread = new PackageGroupThread(packageToGroup);
        Thread thread = new Thread(packageGroupThread);
        thread.start();
    }
}
