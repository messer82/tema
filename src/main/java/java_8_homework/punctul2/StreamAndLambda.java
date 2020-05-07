package java_8_homework.punctul2;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

//Solve the remaining exercises from the last slide of Lambdas&Streams presentation (I pasted them also in the class we've written during course).
// For each exercise create a separate method with an appropriate return type.

public class StreamAndLambda {

    public static void main(String[] args) throws IOException {

        File fileIn = new File("src/main/resources/streamAndLambdaIn.txt");

        List<Person> personList = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileIn));
        String line = reader.readLine();
        while (line != null) {
            String[] lineChunks = line.split(" ");
            personList.add(new Person(lineChunks[0], lineChunks[1], LocalDate.parse(lineChunks[2])));
            line = reader.readLine();
        }
        reader.close();

//        personList.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
//        mai sus este facuta sortarea cu lambda. Alegi care iti place mai mult :)
        personList.sort(Comparator.comparing(Person::getLastName));

        File fileOut = new File("src/main/resources/streamAndLambdaOut.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut));

//        am facut cu luna 4. Poti incerca si cu alta luna. :)
        int monthBeingSearched = 4;
        try {
            for (Person p : personList) {
                if (p.getBirthDate().getMonth().getValue() == monthBeingSearched) {
                    writer.write(p.getFirstName() + " " + p.getLastName() + "\n");
                    writer.flush();
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        if (personList.stream().noneMatch(person -> person.getBirthDate().getMonth().getValue() == monthBeingSearched)) {
            System.out.println("The person does not exist in the list!");
        }
        writer.close();
    }
}

