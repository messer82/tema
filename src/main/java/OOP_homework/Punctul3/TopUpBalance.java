package OOP_homework.Punctul3;

import java.util.Scanner;

public class TopUpBalance extends AccountBalance {
    static int topUpBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to top up your balance? Y / N: ");
        String replyTopUp = scanner.next();
        int balance = AccountBalance.accountBalance();

        if (replyTopUp.equals("Y")) {
            System.out.println("Please input the amount you wish to add to your balance: ");
            int topUp = scanner.nextInt();
            balance = balance + topUp;
            System.out.println("Your new Account Balance is: " + balance);
        }

        return balance;
    }
}
