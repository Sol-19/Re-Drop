package entites;

public class Player extends Entity{
    /*
    Summary:
    This is a class for a the Player, below are the default stats for the Player Entity
    HP = 100
    ATTACK = 10
     */
    public Player(){
        super(100,10);
    }

    @Override 
    public void repr(){
        System.out.println("HP: "+this.getHealthPoints());
        System.out.println("Attack: "+this.getAttackPoints());
    }
}
