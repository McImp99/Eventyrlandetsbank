package Exceptions;
//User defined user definition of an exception to let know there is no such accountfound in the program

public class AccountNotFoundException extends Exception{
    public AccountNotFoundException(String message) {
        super(message);
    }
}
