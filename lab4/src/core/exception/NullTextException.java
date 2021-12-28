package core.exception;

public class NullTextException extends RuntimeException{
    private static final String message = "Текст не может быть пустым!";


    public NullTextException() {
        super(message);
    }

    public NullTextException(Throwable cause) {
        super(message, cause);
    }
}
