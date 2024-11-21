import Bank.BankSystem;

public class Main {
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();

        //Adds two accounts into the arraylist
        bankSystem.createAccount("12345", 1000.0);
        bankSystem.createAccount("67890", 500.0);

        //Using deposit method from Banksystem.java into the account created
        bankSystem.deposit("12345", 200.0);

        //Using withdraw method from Bank.BankSystem.java
        bankSystem.withdraw("12345", 150.0);

        //Using withdraw method, but to show InsufficientFundsException cause the amount is higher than the actual balance
        bankSystem.withdraw("67890", 600.0);

        //Using withdraw method, but to show AccountNotFoundException
        bankSystem.withdraw("99999", 100.0);


        //Using transfer method to show valid transfer
        bankSystem.transfer("12345", "67890", 300);

        //Using transfer method to show invalid transfer cause of funds
        bankSystem.transfer("12345", "67890", 800);

        //Using tranfer method to show AccountNotFound
        bankSystem.transfer("12345", "63263", 300);

    } // main end
}

