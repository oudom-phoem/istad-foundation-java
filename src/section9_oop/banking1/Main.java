package section9_oop.banking1;

import section9_oop.banking1.model.Account;
import section9_oop.banking1.model.CreditCardAccount;

public class Main {
    public static void main(String[] args) {
        Account creditCardAccount = new CreditCardAccount();
        creditCardAccount.deposit(101.0);
        creditCardAccount.showBalance();
        creditCardAccount.withdraw(50.0);
        creditCardAccount.showBalance();
    }
}
