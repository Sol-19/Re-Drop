package entites;

public abstract class Entity {
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
