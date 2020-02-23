package oop_homework_2.punctul2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PhoneUse {

    public static void main(String[] args) {
/*     Am comentat aproape toate metodele, pentru a se putea distinge ce rulezi;
       Daca crezi ca ar mai trebui modificat ceva (s-ar putea sa nu fi inteles eu bine vreo sarcina / conditie,
       spune-mi, te rog, si refac / modific imediat
 */
        long leftLimit = 1L;
        long rightLimit = 16L;

        HuaweiP10Lite huaweiP10Lite = new HuaweiP10Lite(((int) (Math.random() * 10)), "blue", "plastic", (leftLimit + (long) (Math.random() * (rightLimit - leftLimit))));
        SamsungGalaxyA50 samsungGalaxyA50 = new SamsungGalaxyA50(((int) (Math.random() * 10)), "red", "metal", (leftLimit + (long) (Math.random() * (rightLimit - leftLimit))));

        Random random = new Random();

        Contacts firstContact = new Contacts(("07" + (10000000 + random.nextInt(90000000))), "John", "Doe");
        Contacts secondContact = new Contacts(("07" + (10000000 + random.nextInt(90000000))), "Jane", "Doe");
        Contacts thirdContact = new Contacts(("07" + (10000000 + random.nextInt(90000000))), "Jim", "Doe");

        huaweiP10Lite.addContact(firstContact);
        huaweiP10Lite.addContact(secondContact);
        huaweiP10Lite.addContact(thirdContact);

//        huaweiP10Lite.listContacts();

        samsungGalaxyA50.addContact(firstContact);
        samsungGalaxyA50.addContact(secondContact);
        samsungGalaxyA50.addContact(thirdContact);

//        samsungGalaxyA50.listContacts();

        TextMessage textMessage1 = new TextMessage(firstContact.getPhoneNumber(),"I will call you later.", firstContact.getPhoneNumber());
        TextMessage textMessage2 = new TextMessage(secondContact.getPhoneNumber(),"I am in a meeting!", firstContact.getPhoneNumber());
        TextMessage textMessage3 = new TextMessage(thirdContact.getPhoneNumber(),"Talk to you tomorrow.", firstContact.getPhoneNumber());

        if (huaweiP10Lite.getBatteryLife() < 1) {
            System.out.println("Your phone doesn't have enough battery to send the message. Please recharge it!");
        }
        else if (textMessage2.getTextMessage().length() < 500){
//            System.out.println("The available battery life is: " + huaweiP10Lite.getBatteryLife());
            huaweiP10Lite.sendMessage(textMessage2);
            huaweiP10Lite.setBatteryLife(huaweiP10Lite.getBatteryLife() - 1);
//            System.out.println("Remaining battery life after sending the text message is: " + huaweiP10Lite.getBatteryLife());;

        } else {
            System.out.println("The text message exceeds 500 characters. Please input a text of under 500 characters.");
        }

//        huaweiP10Lite.listMessages();

        if (samsungGalaxyA50.getBatteryLife() < 1) {
            System.out.println("Your phone doesn't have enough battery to send the message. Please recharge it!");
        }
        else if (textMessage3.getTextMessage().length() < 500){
//            System.out.println("The available battery life is: " + samsungGalaxyA50.getBatteryLife());
            samsungGalaxyA50.sendMessage(textMessage3);
            samsungGalaxyA50.setBatteryLife(samsungGalaxyA50.getBatteryLife() - 1);
//            System.out.println("Remaining battery life after sending the text message is: " + samsungGalaxyA50.getBatteryLife());;

        } else {
            System.out.println("The text message exceeds 500 characters. Please input a text of under 500 characters.");
        }

//        samsungGalaxyA50.listMessages();

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        Calls firstCall = new Calls(firstContact.getPhoneNumber(), secondContact.getPhoneNumber(), (decimalFormat.format(Math.random() * 10)));

        if (huaweiP10Lite.getBatteryLife() < 2) {
            System.out.println("Your phone doesn't have enough battery to send the message. Please recharge it!");
        } else {
            huaweiP10Lite.call(firstCall);
        }

//        huaweiP10Lite.viewHistory();

        if (samsungGalaxyA50.getBatteryLife() < 2){
            System.out.println("Your phone doesn't have enough battery to send the message. Please recharge it!");
        } else {
            samsungGalaxyA50.call(firstCall);
        }

        samsungGalaxyA50.viewHistory();
    }
}
