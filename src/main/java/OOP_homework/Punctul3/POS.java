package OOP_homework.Punctul3;

import java.util.Scanner;

public class POS extends BankAccount {
    static void withdrawalPOS() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to make a withdrawal? Y / N:");
        String replyWithdrawal = scanner.next();

        if (replyWithdrawal.equals("Y")) {
            System.out.println("Please input the amount which you want to withdraw: ");
            int withdrawAmount = scanner.nextInt();
        }
    }

    static void amountCheck() {

    }
}
