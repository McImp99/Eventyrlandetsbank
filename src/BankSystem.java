import Exceptions.AccountNotFoundException;
import Exceptions.InsufficientFundsException;

import java.util.ArrayList;
import java.util.List;

public class BankSystem {
    //Declares an arraylist with name of accounts
    private List<BankAccount> accounts;

    //initializes the list <accounts> as an empty arraylist, used to add accounts at a later point
    public BankSystem() {
        accounts = new ArrayList<>();
    }

    /*
    Method to create new account, add it to the arraylist <accounts> using parameters String accountNumber and
    double initialBalance and then returns a message that account has been registered with the accountNumber
     */
    public void createAccount(String accountNumber, double initialBalance) {
        BankAccount account = new BankAccount(accountNumber, initialBalance);
        accounts.add(account);
        System.out.println("Account has been registrered: " + accountNumber);
    }

    /*
    Method to find account with a specific accountNumber as the parameter, and if account doesn't exist throws the
    AccountNotFoundException with a message saying the following accountNumber doesn't exist. If exists returns the account
     */
    public BankAccount findAccount(String accountNumber) throws AccountNotFoundException {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new AccountNotFoundException("The account with the following accountnumber: " + accountNumber + " was not found");
    }

    /*
    Method to deposit into an account taking parameters accountNumber and amount, also throws the AccountNotFoundException
    if accountNumber doesn't exist.
     */
    public void deposit(String accountNumber, double amount) {
        try {
            BankAccount account = findAccount(accountNumber);
            account.deposit(amount);
            System.out.println("Deposited " + amount + " on the account " + accountNumber);
        } catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /*
    Method to withdraw money from account taking parameters accountNumber and amount. Checks for AccountNotFound
    and InsufficientFunds exceptions, returns messages if so, if not then it successfully returns how much was withdrawn
    from the accountNumber given.
     */
    public void withdraw(String accountNumber, double amount) {
        try {
            BankAccount account = findAccount(accountNumber);
            account.withdraw(amount);
            System.out.println("Withdrew " + amount + " on the account " + accountNumber);
        } catch (AccountNotFoundException e) {
            System.out.println("Account not found: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient funds: " + e.getMessage());
        }
    }
}

