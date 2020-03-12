package exceptions_and_logging_homework;

import java.util.*;

public class studentRepository {

    public static void main(String[] args) throws Exception {

        List<Student> studentList = new LinkedList<>();

        try {
            Student student = new Student(studentFirstName("df"), studentLastName("dfg"), studentDateOfBirth(2000), studentGender("m"), studentID("1820902245048"));

            studentList.add(student);
            System.out.println(studentList);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static String studentFirstName(String firstName) throws Exception {
        if (firstName.isEmpty()) {
            throw new Exception("First name cannot be empty!");
        }
        return firstName;
    }

    static String studentLastName(String lastName) throws Exception {
        if (lastName.isEmpty()) {
            throw new Exception("Last name cannot be empty!");
        }
        return lastName;
    }

    static int studentDateOfBirth(int dateOfBirth) throws Exception {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (currentYear - dateOfBirth < 18) {
            throw new Exception("You must be at least 18 years of age!");
        }
        return dateOfBirth;
    }

    static String studentGender(String gender) throws Exception {
        if(!gender.equalsIgnoreCase("m") || !gender.equalsIgnoreCase("f")) {
            throw new Exception("Please input the gender as M or F!");
        }
        return gender;
    }

    static String studentID(String ID) throws Exception {
        if (ID.length() != 13 && ID.replaceAll("[^\\w]+", "").
                replaceAll("[a-zA-Z]+", "").length() != 13 &&
                !ID.startsWith("1") || !ID.startsWith("2")) {
            throw new Exception("CNP is not correct!");
        }
        return ID;
    }
}
