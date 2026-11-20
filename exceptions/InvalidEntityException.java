package exceptions;

public class InvalidEntityException extends RuntimeException{
    InvalidEntityException(String message){
        super(message);
    }
    InvalidEntityException(){
        super("No message was entered when this exception was thrown");
    }
}
