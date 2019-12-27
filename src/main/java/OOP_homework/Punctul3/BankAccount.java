package OOP_homework.Punctul3;

public class BankAccount {
    private String account;

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String fAccount) {
        this.account = fAccount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "account='" + account + '\'' +
                '}';
    }
}
