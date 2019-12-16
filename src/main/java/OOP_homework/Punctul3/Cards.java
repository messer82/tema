package OOP_homework.Punctul3;

import java.util.Random;
import java.util.Scanner;

public class Cards extends BankAccount {
    static void createCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want a card created for this Bank Account? Y / N: ");
        String replyCard = scanner.next();
        long min = 1000000000000000L;
        long max = 9999999999999999L;

        if (replyCard.equals("Y")) {
            long cardNumber = new Random().nextLong()% (max - min) + max;
            System.out.println("Your new card number is: " + cardNumber);
        } else {
            System.out.println("You will not have a card attached to this Bank Account!");
        }
    }
}
