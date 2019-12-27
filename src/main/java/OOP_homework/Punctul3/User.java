package OOP_homework.Punctul3;

public class User {
    private String user;
    private Card[] cards = new Card[10];
    private BankAccount[] bankAccounts = new BankAccount[10];

    public void addCard(Card card){
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) { // cautam primul loc liber in array sa adaugam un nou card
                cards[i] = card;
                break;
            }
        }
    }

    public void addBankAccount(BankAccount bankAccount){
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i] == null) { // cautam primul loc liber in array sa adaugam un nou bankAccount
                bankAccounts[i] = bankAccount;
                break;
            }
        }
    }



    public String getUser() {
        return this.user;
    }

    public void setUser(String fUser) {
        this.user = fUser;
    }

    public void createUser() {
        User firstUser = new User();
        firstUser.setUser("John Doe");
        User secondUser = new User();
        secondUser.setUser("Jane Doe");
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
