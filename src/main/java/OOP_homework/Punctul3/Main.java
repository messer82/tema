package OOP_homework.Punctul3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        User firstUser = new User();
        firstUser.setUser("John Doe");
        User secondUser = new User();
        secondUser.setUser("Jane Doe");

        String bankReference = "RO38ZZZZ00000000";
        int a = 10000000 + new Random().nextInt(90000000);

        BankAccount firstAccount = new BankAccount();
        firstAccount.setAccount(bankReference + a);
        BankAccount secondAccount = new BankAccount();
        secondAccount.setAccount(bankReference + a);

        long min = 1000000000000000L;
        long max = 9999999999999999L;
        long cardNumber = new Random().nextLong()% (max - min) + max;

        Card firstCard = new Card();
        firstCard.setCard(cardNumber);
        Card secondCard = new Card();
        secondCard.setCard(cardNumber);

        System.out.println("The first user is: " + firstUser.getUser());
        System.out.println("With the attached account " + firstAccount.getAccount());
        System.out.println("And the attached card: " + firstCard.getCard());

//        System.out.println("The second user is " + secondUser.getUser());
//        System.out.println("With the attached account " + secondAccount.getAccount());
//        System.out.println("And the attached card: " + secondCard.getCard());

        int accountBalance = 1000 + new Random().nextInt(9000);
        int amountWithdraw = 1000 + new Random().nextInt(9000);

        Pos posWithdraw = new Pos();
        posWithdraw.setPos(accountBalance-amountWithdraw);

        System.out.println("The amount you want to withdraw is: " + amountWithdraw);

        if (accountBalance < amountWithdraw) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Please take the money and the receipt");
        }

        Receipt receipt = new Receipt();
        receipt.setReceipt("The receipt will be printed!");

        if (accountBalance < amountWithdraw) {
            System.out.println("The receipt of insufficient funds will be printed!");
        } else {
            System.out.println("The receipt of the success of the transaction will be printed!");
        }
    }
}
