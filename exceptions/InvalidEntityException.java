package exceptions;

public class InvalidEntityException extends RuntimeException{
    public InvalidEntityException(String message){
        super(message);
    }
    
    public InvalidEntityException(){
        this("No message was entered when this exception was thrown");
    }
}
