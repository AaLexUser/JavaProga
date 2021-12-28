package core.exception;

public class IllegalArgumentTypeException extends RuntimeException{
    private static final String message = "Передан не правильный тип аргумента";

    public IllegalArgumentTypeException() {
        super(message);
    }
}
