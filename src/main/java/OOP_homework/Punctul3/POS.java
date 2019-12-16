package OOP_homework.Punctul3;

import java.util.Scanner;

public class POS extends BankAccount {
    private void cardCheck() {
        getAccount();
    }
    static int withdrawalPOS() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the amount you want yo withdraw: ");
        int withdrawAmount = scanner.nextInt();
        return withdrawAmount;

    }
}
