package entites;

public class Entity {
    private int healthpoints;
    private int attackpoints;
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
