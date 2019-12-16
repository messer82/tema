package OOP_homework.Punctul3;

import java.util.Random;
import java.util.Scanner;

public class AccountBalance {
    static int accountBalance() {
        Scanner scanner = new Scanner(System.in);
        Random bal = new Random();
        int balance = bal.nextInt(9999);
        return balance;
    }
}