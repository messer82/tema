package OOP_homework.Punctul3;

public class Receipt extends POS {
    static void printReceipt() {
        int withdrewAmount = withdrawalPOS();
        int balance = AccountBalance.accountBalance();

        if (withdrewAmount < balance) {
            System.out.println("Your receipt will be printed!");
        } else {
            System.out.println("Insufficient funds.");
        }
        
    }
}
