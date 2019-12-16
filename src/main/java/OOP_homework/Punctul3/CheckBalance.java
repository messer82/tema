package OOP_homework.Punctul3;

import java.util.Scanner;

public class CheckBalance extends AccountBalance {
    static int checkBalance() {
        int balance = AccountBalance.accountBalance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to check your Account Balance? Y / N: ");
        String replyBalance = scanner.next();

        if (replyBalance.equals("Y")) {
            System.out.println("Your account balance is: " + balance);
        }
        return balance;
    }
}
