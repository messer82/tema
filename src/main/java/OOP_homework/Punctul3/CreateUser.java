package OOP_homework.Punctul3;

import java.util.Scanner;

public class CreateUser {
    static String user() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to create a user? Y / N: ");
        String replyUser = scanner.next();

        if (replyUser.equals("Y")) {
            System.out.println("Please type your name: ");
            String name = scanner.next();
            System.out.println("Please type your surname: ");
            String surname = scanner.next();
            System.out.println("Please input your ID number: ");
            int idNumber = scanner.nextInt(); // Nu am vrut sa o complic mai mult cu CNP, etc.

            String userDetails = name + " " + surname + " " + idNumber;
            return userDetails;
        } else if (replyUser.equals("N")) {
            System.out.println("We would have liked for you to use our services! Good bye!");
        } else {
            System.out.println("Please reply with Y or N.");
        }


        if (!replyUser.equals("Y")) {
            try {
                Thread.sleep(3000);}
            catch(InterruptedException e){
                e.printStackTrace();
                }
                System.exit(1);
        }
        return replyUser;
    }
}
