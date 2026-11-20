package exceptions;

public class InvalidEntityException extends RuntimeException{
    InvalidEntityException(String message){
        super(message);
    }
}
