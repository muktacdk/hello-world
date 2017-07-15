package BankSystem.Customer;

import BankSystem.Account.AccountService;

/**
 * Created by kulkarmu on 7/14/2017.
 */
public class CustomerService extends AccountService {

    String accHolder;

    public CustomerService(String accHolder) {
        this.accHolder = accHolder;
    }

    public void createAccount() {
        System.out.println(accHolder + " your account is created successfully..!!!!");

    }

    public void credit(double amount) {
        super.credit(amount);
    }

    public void debit(double amount) {
        super.debit(amount);
    }

}
