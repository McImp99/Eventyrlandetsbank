package Exceptions;
//User defined user definition of an exception to let know there is insufficientfunds for the required action

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
