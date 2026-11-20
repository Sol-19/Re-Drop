package entities;

public abstract class Entity {
    /*
    Summary:
    This is the base class for everything in the game that has HP and attack (the Player and all monsters).
    You can't create an Entity directly, only one of its subclasses.

    Every subclass has to implement repr(), which prints the entity's stats.

    The constructor is package-private, so code outside the entities package can't call
    new Slime(...) directly. Use MonsterFactory to create monsters instead.
     */
    private int healthpoints;
    private int attackpoints;

    public abstract void repr();
    
    Entity(int health, int attack){
        this.healthpoints = health;
        this.attackpoints = attack;
    }

    public void setHealthPoints(int health){
        this.healthpoints = health;
    }

    public void setAttackPoints(int attackpoints){
        this.attackpoints = attackpoints;
    }

    public int getHealthPoints(){
        return this.healthpoints;
    }

    public int getAttackPoints(){
        return this.attackpoints;
    }
}
