package exceptions;

public class InvalidMonsterException extends RuntimeException{
    /*
    Summary:
    Thrown when you try to create a monster that does not exist, either an unknown
    monster type in MonsterFactory or an unknown element in a monster's constructor.

    It extends RuntimeException, so you don't have to wrap monster creation in try/catch.
    If it isn't caught, the program stops and prints the message.
     */
    public InvalidMonsterException(String message){
        super(message);
    }

    public InvalidMonsterException(){
        this("No message was entered when this exception was thrown");
    }
}
