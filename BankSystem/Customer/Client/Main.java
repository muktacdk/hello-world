package BankSystem.Customer.Client;

import BankSystem.Account.AccountService;
import BankSystem.BankService;
import BankSystem.Customer.CustomerService;

/**
 * Created by kulkarmu on 7/14/2017.
 */
public class Main {

    public static void main(String[] args) {
        CustomerService cs = new CustomerService("mukta");
        cs.createAccount();
        System.out.println("Initial balance : " + cs.getBalance());
        cs.credit(10000.00);
        System.out.println("Your balance after credit : " + cs.getBalance());
        cs.debit(2000.00);
        System.out.println("Your balance after debit : " + cs.getBalance());

        AccountService ac = new AccountService();
        BankService bs = new BankService();

    }
}
