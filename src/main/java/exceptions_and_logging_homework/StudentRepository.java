package exceptions_and_logging_homework;

import sun.rmi.runtime.Log;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.*;

import static exceptions_and_logging_homework.InvalidStudentException.*;

public class StudentRepository {
    private static Logger logger = java.util.logging.Logger.getLogger(Log.class.getName());

    public static void main(String[] args) {

        StudentLogger();

        logger.info("Start main!");

        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new LinkedList<>();

        try {
            Student student1 = new Student(studentFirstName(""), studentLastName("Ion"), studentDateOfBirth(LocalDate.of(2000, 2, 2)), studentGender("M"), studentID("1234567891231"));
            studentList.add(student1);
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }
        try {
            Student student2 = new Student(studentFirstName("Ion"), studentLastName(""), studentDateOfBirth(LocalDate.of(2000, 2, 2)), studentGender("M"), studentID("1234567891232"));
            studentList.add(student2);
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }
        try {
            Student student3 = new Student(studentFirstName("Ion"), studentLastName("Ion"), studentDateOfBirth(LocalDate.of(2011, 2, 2)), studentGender("M"), studentID("1234567891233"));
            studentList.add(student3);
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }
        try {
            Student student4 = new Student(studentFirstName("Ion"), studentLastName("Ion"), studentDateOfBirth(LocalDate.of(2001, 2, 2)), studentGender("h"), studentID("1234567891234"));
            studentList.add(student4);
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }
        try {
            Student student5 = new Student(studentFirstName("Ion"), studentLastName("Ion"), studentDateOfBirth(LocalDate.of(2001, 2, 2)), studentGender("m"), studentID("12345678912f4"));
            studentList.add(student5);
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }
        try {
            Student student6 = new Student(studentFirstName("Ioana"), studentLastName("Ioana"), studentDateOfBirth(LocalDate.of(2001, 2, 2)), studentGender("f"), studentID("2234567891235"));
            studentList.add(student6);
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }
        try {
            Student student7 = new Student(studentFirstName("Ioana"), studentLastName("Ioana"), studentDateOfBirth(LocalDate.of(2002, 2, 2)), studentGender("F"), studentID("2234567891236"));
            studentList.add(student7);
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }
        try {
            Student student8 = new Student(studentFirstName("Vasile"), studentLastName("Vasile"), studentDateOfBirth(LocalDate.of(2001, 5, 2)), studentGender("M"), studentID("1234567891237"));
            studentList.add(student8);
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }
        try {
            Student student9 = new Student(studentFirstName("George"), studentLastName("George"), studentDateOfBirth(LocalDate.of(1999, 3, 3)), studentGender("m"), studentID("1234567891238"));
            studentList.add(student9);
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }
        try {
            Student student10 = new Student(studentFirstName("Ion"), studentLastName("Ion"), studentDateOfBirth(LocalDate.of(1999, 4, 3)), studentGender("m"), studentID("1234567891239"));
            studentList.add(student10);
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }

        for (Student s : studentList) {
            System.out.println(s);
        }

        System.out.println("ID of student which you want to delete: ");
        String idToBeDeleted = scanner.next();

        try {
            studentList.removeIf(s -> s.getID().equalsIgnoreCase(idToBeDeleted(idToBeDeleted)));
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }
        for (Student s : studentList) {
            System.out.println(s);
        }

        System.out.println("Age of students to be retrieved: ");
        int ageOfStudentsForRetrieval = scanner.nextInt();

        try {
            for (Student s : studentList) {
                if (ageOfStudentToBeRetrieved(ageOfStudentsForRetrieval) ==
                LocalDate.now().getYear() - s.getDateOfBirth().getYear()) {
                    System.out.println(s);
                }
            }
        } catch(InvalidStudentException e){
                System.out.println(e);
            }
        logger.info("End main!");
        }

    private static void StudentLogger() {
        logger.setLevel(Level.ALL);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.SEVERE);
        logger.addHandler(consoleHandler);

        try {
            FileHandler fileHandler = new FileHandler("StudentRepository.log");
            fileHandler.setLevel(Level.ALL);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "File logger not working!", e);
        }
    }
}


