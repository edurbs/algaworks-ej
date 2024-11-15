package banco.exception;

public class ContaException extends RuntimeException {

    public ContaException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContaException(String message){
        super(message);
    }
}
