package oop_homework_2.punctul2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PhoneUse {

    public static void main(String[] args) {
//        working progress

        HuaweiP10Lite huaweiP10Lite = new HuaweiP10Lite();
        SamsungGalaxyA50 samsungGalaxyA50 = new SamsungGalaxyA50();
        Contacts contacts = new Contacts();


        huaweiP10Lite.listContacts();

        Random random = new Random();
        int randomNumber = 10000000 + random.nextInt(90000000);
        String generatedPhoneNumber = "07" + randomNumber;

        Contacts firstContact = new Contacts(generatedPhoneNumber, "John", "Doe");
        Contacts secondContact = new Contacts(generatedPhoneNumber, "Jane", "Doe");
        Contacts thirdContact = new Contacts(generatedPhoneNumber, "Jim", "Doe");

        huaweiP10Lite.addContact(firstContact);
        huaweiP10Lite.addContact(secondContact);
        huaweiP10Lite.addContact(thirdContact);

        huaweiP10Lite.listContacts();

        samsungGalaxyA50.addContact(firstContact);
        samsungGalaxyA50.addContact(secondContact);
        samsungGalaxyA50.addContact(thirdContact);

        samsungGalaxyA50.listContacts();

    }
}
