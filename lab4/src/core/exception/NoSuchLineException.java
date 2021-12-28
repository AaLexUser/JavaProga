package core.exception;

public class NoSuchLineException extends RuntimeException{
    private static final String message = "Строка не найдена!";

    public NoSuchLineException() {
        super(message);
    }

    public NoSuchLineException(Throwable cause) {
        super(message, cause);
    }
}
