package Exceptions;

public class AmountException extends RuntimeException {

    public AmountException(String errorMessage) {
        super(errorMessage);
    }
}