package oop_homework_2.punctul2;

import java.util.Random;

public class Contacts {
    private String phoneNumber, firstName, lastName;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contacts(int contactNumber, String phoneNumber, String firstName, String lastName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName= lastName;
    }

    public void addContact() {
        Random random = new Random();
        Contacts firstContact = new Contacts(1, "(07 + random.nextInt(100000000))", "John", "Doe");
        Contacts secondContact = new Contacts(2, "(07 + random.nextInt(100000000))", "Jane", "Doe");
        Contacts thirdContact = new Contacts(3, "(07 + random.nextInt(100000000))", "Jim", "Doe");
        
    }
}
