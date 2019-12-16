package OOP_homework.Punctul3;

import java.util.Random;
import java.util.Scanner;

public class CreateAccount {
    static void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to create a new account? Y / N: ");
        String replyAccount = scanner.next();

        if (replyAccount.equals("Y")) {
                String bankReference = "RO38ZZZZ00000000";
                int a = 10000000 + new Random().nextInt(90000000);
                System.out.println("Your account number is: " + bankReference + a);
            } else if (replyAccount.equals("N")) {
                System.out.println("You can't use our services without a bank account! Good bye!");
            } else {
                System.out.println("Please reply with Y or N: ");
            }

        if (!replyAccount.equals("Y")) {
            try {
                Thread.sleep(3000);}
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.exit(1);

        }
    }
}