package id317864189_id315083311.exceptions;

public class InvalidChoiceException extends Exception {
    private static final String PRE_ERROR = "The Choice you entered is not valid.";

    public InvalidChoiceException(String message) {
        super(PRE_ERROR + message);
    }
}
