package Exceptions;
//User defined user definition of an exception to let know there is invalidamount for the required action

public class InvalidAmountException  extends RuntimeException{
    public InvalidAmountException(String message) {
        super(message);
    }
}
