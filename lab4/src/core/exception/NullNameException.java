package core.exception;

public class NullNameException extends Exception{
    private static final String message = "Error! Name can't be empty";


    public NullNameException() {
        super(message);
    }

    public NullNameException(Throwable cause) {
        super(message, cause);
    }

}
