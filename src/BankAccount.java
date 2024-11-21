import Exceptions.InsufficientFundsException;
import Exceptions.InvalidAmountException;

public class BankAccount {
    //attributes
    String accountNumber;
    double balance;

    // constructor to initialize ny account with accountnumber and a starting balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    /*
    Validates the deposit to check the amount is higher than 0 and throws an exception if it isn't to
    explain that amount has to be higher than 0. If it is higher than 0, then adds to the balance
    */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount has to be higher than 0");
        }
        balance +=amount;
    }

    /*
    Validates the amount being withdrawn from the account to check that its higher than 0 and also checks for funds in
    the account, if both things are validated correctly then it will withdraw the money from the balance.
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount has to be higher than 0");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough funds available on the account");
        }
        balance -= amount;
    }

    //Returns the actual saldo on the account
    public double getBalance() {
        return balance;
    }

    //returns the accountnumber for the account
    public String getAccountNumber() {
        return accountNumber;
    }


}
