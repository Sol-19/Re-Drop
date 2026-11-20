package entites;

public class Slime extends Entity{
    /*
    Summary:
    This is a class for a slime monster, below are the default stats for the Slime Entity
    HP = 100
    ATTACK = 20
     */
    String element;
    Slime(String element){
        super(100,20);
    }

}