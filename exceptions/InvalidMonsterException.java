package exceptions;

public class InvalidMonsterException extends RuntimeException{
    public InvalidMonsterException(String message){
        super(message);
    }

    public InvalidMonsterException(){
        this("No message was entered when this exception was thrown");
    }
}
