package exceptions_and_logging_homework;

import java.time.LocalDate;
import java.util.InputMismatchException;

public class InvalidStudentException extends RuntimeException {
    public InvalidStudentException(String errorMessage) {
        super(errorMessage);
    }

    static String studentFirstName(String firstName) throws InvalidStudentException {
        if (firstName.isEmpty() ||
                firstName.length() != firstName.
                        trim().
                        replaceAll("[^\\w]+", "").
                        replaceAll("\\d+", "").
                        length()) {
            throw new InvalidStudentException("First name should not be empty, and should contain only letters!");
        }
        return firstName;
    }

    static String studentLastName(String lastName) throws InvalidStudentException {
        if (lastName.isEmpty() ||
                lastName.length() != lastName.
                        trim().
                        replaceAll("[^\\w]+", "").
                        replaceAll("\\d+", "").
                        length()) {
            throw new InvalidStudentException("Last name should not be empty, and should contain only letters!");
        }
        return lastName;
    }

    static LocalDate studentDateOfBirth(LocalDate dateOfBirth) throws InvalidStudentException {
        if (dateOfBirth.isAfter(LocalDate.now().minusYears(18))) {
            throw new InvalidStudentException("You must be at least 18 years old!");
        }
        return dateOfBirth;
    }

    static String studentGender(String gender) throws InvalidStudentException {
        if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")) {
            return gender;
        }
        throw new InvalidStudentException("Please input the correct gender: M / F!");
    }

    static String studentID(String ID) throws InvalidStudentException {
        if (ID.length() == 13 && ID.trim().replaceAll("[^\\d]+", "").length() == 13 &&
                (ID.startsWith("1") || ID.startsWith("2"))) {
            return ID;
        }
        throw new InvalidStudentException("Please input the correct CNP comprised of 13 digits!");
    }

    static String idToBeDeleted(String idToBeDeleted) throws InvalidStudentException {
        if (idToBeDeleted.isEmpty() || idToBeDeleted.length() != 13 && idToBeDeleted.trim().replaceAll("[^\\d]+", "").length() != 13 ||
                !(idToBeDeleted.startsWith("1") || idToBeDeleted.startsWith("2"))) {
            throw new InvalidStudentException("Student does not exist!");
        }
        return idToBeDeleted;
    }

    static int ageOfStudentToBeRetrieved(int ageOfStudentsForRetrieval) throws InvalidStudentException, InputMismatchException {
        if (ageOfStudentsForRetrieval < 0) {
            throw new InvalidStudentException("Age must be a positive number!");
        }
        return ageOfStudentsForRetrieval;
    }
}
