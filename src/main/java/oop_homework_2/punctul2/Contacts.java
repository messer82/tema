package oop_homework_2.punctul2;

import java.util.*;

public class Contacts {
    private String phoneNumber, firstName, lastName;

    public Contacts() {

    }

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

    public Contacts(String phoneNumber, String firstName, String lastName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName= lastName;
    }

//    public Contacts(Random random) {
//        this.random = random;
//    }

//    Random random = new Random();
//    int randomNumber = 1000 + random.nextInt(9000);
//    String generatedPhoneNumber = "07" + randomNumber + randomNumber;

    Contacts firstContact = new Contacts("0726464896", "John", "Doe");
    Contacts secondContact = new Contacts("0763159753", "Jane", "Doe");
    Contacts thirdContact = new Contacts("0746258963", "Jim", "Doe");

    List<Contacts> contacts = new ArrayList<>();

    public void addContact() {
        contacts.add(firstContact);
        contacts.add(secondContact);
        contacts.add(thirdContact);

    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
//                ", random=" + random +
                ", firstContact=" + firstContact +
                ", secondContact=" + secondContact +
                ", thirdContact=" + thirdContact +
                ", contacts=" + contacts +
                '}';
    }

    public void listContacts() {
        System.out.println(Arrays.toString(contacts.toArray()));
    }
}
