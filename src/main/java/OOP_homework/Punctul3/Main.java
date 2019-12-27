package OOP_homework.Punctul3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        User firstUser = new User();
        firstUser.setUser("John Doe");
        User secondUser = new User();
        secondUser.setUser("Jane Doe");

        String[] users = {firstUser.getUser() , secondUser.getUser()};

//        System.out.println((Arrays.toString(users)));

        String bankReference = "RO38ZZZZ00000000";
        int a = 10000000 + new Random().nextInt(90000000);

        BankAccount firstAccount = new BankAccount();
        firstAccount.setAccount(bankReference + a);
        BankAccount secondAccount = new BankAccount();
        secondAccount.setAccount(bankReference + a);



        // aici adaugam bank account-uri pentru userul firstUser
        firstUser.addBankAccount(firstAccount);
        firstUser.addBankAccount(secondAccount);

        // printam conturile userului sa ne asiguram ca au fost adaugate
        // pentru asta avem nevoie sa ne generam si metoda toString() in clasa BankAccount
        System.out.println("Conturile userului firstUser sunt: " + Arrays.toString(firstUser.getBankAccounts()));





        String[] accounts = {firstAccount.getAccount() , secondAccount.getAccount()};

//        System.out.println(Arrays.toString(accounts));

        long min = 1000000000000000L;
        long max = 9999999999999999L;
        long cardNumber = new Random().nextLong()% (max - min) + max;

        Card firstCard = new Card();
        firstCard.setCard(cardNumber);
        Card secondCard = new Card();
        secondCard.setCard(cardNumber);




        // aici adaugam carduri pentru userul firstUser
        firstUser.addCard(firstCard);
        firstUser.addCard(secondCard);

        // printam cardurile userului sa ne asiguram ca au fost adaugate
        // pentru asta avem nevoie sa ne generam si metoda toString() in clasa Card
        System.out.println("Conturile userului firstUser sunt: " + Arrays.toString(firstUser.getCards()));
        // se pot printa si cu un for pentru a nu mai printa null-urile
//        for (BankAccount ba: firstUser.getBankAccounts()) {
//            if (ba != null) {
//                System.out.println(ba);
//            }
//        }


        Long[] cards = {firstCard.getCard() , secondCard.getCard()};

//        System.out.println(Arrays.toString(cards));

//        System.out.println("The first user is: " + firstUser.getUser());
//        System.out.println("With the attached account " + firstAccount.getAccount());
//        System.out.println("And the attached card: " + firstCard.getCard());

//        System.out.println("The second user is " + secondUser.getUser());
//        System.out.println("With the attached account " + secondAccount.getAccount());
//        System.out.println("And the attached card: " + secondCard.getCard());

        int accountBalance = 1000 + new Random().nextInt(9000);
        int amountWithdraw = 1000 + new Random().nextInt(9000);

        Pos posWithdraw = new Pos();
        posWithdraw.setPos(accountBalance-amountWithdraw);

//        System.out.println("The amount you want to withdraw is: " + amountWithdraw);

//        if (accountBalance < amountWithdraw) {
//            System.out.println("Insufficient funds!");
//        } else {
//            System.out.println("Please take the money and the receipt");
//        }

        Receipt receipt = new Receipt();
        receipt.setReceipt("The receipt will be printed!");

//        if (accountBalance < amountWithdraw) {
//            System.out.println("The receipt of insufficient funds will be printed!");
//        } else {
//            System.out.println("The receipt of the success of the transaction will be printed!");
//        }
    }
}
