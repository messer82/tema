package OOP_homework.Punctul3;

import java.util.Random;
import java.util.Scanner;

public class AccountBalance {
    static int accountBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to check your Account Balance? Y / N: ");
        String replyBalance = scanner.next();
        Random bal = new Random();
        int balance = bal.nextInt(9999);

        if (replyBalance.equals("Y")) {
            System.out.println("Your account balance is: " + balance);
        }

        System.out.println("Do you want to top up your balance? Y / N: ");
        String replyTopUp = scanner.next();

        if (replyTopUp.equals("Y")) {
            System.out.println("Please input the amount you wish to add to your balance: ");
            int topUp = scanner.nextInt();
            balance = balance + topUp;
            System.out.println("Your new Account Balance is: " + balance);
        }

        return balance;
    }
}