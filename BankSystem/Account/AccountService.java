package BankSystem.Account;

/**
 * Created by kulkarmu on 7/14/2017.
 */
public class AccountService {
    private double balance;
    //long accountNumber;

    public AccountService(){

    }

   /* public AccountService(long accountNumber) {
        this.accountNumber = accountNumber;
    }*/

    protected void credit(double amount) {
        this.balance = amount;
    }

    protected void debit(double amount) {
        this.balance = amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
