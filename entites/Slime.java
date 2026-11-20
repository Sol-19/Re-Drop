package entites;

import exceptions.InvalidMonsterException;

public class Slime extends Entity{
    /*
    Summary:
    This is a class for a slime monster, below are the default stats for the Slime Entity
    HP = 100
    ATTACK = 20
     */
    private String element;
    Slime(String element){
        super(100,20);
        switch (element){
            case "fire", "water", "earth", "wind", "none"-> {this.element = element;}
            default -> throw new InvalidMonsterException("The element "+ element +" does not exist in our game gng"); 
        }
    }

    @Override 
    public void repr(){
        System.out.println("HP: "+this.getHealthPoints());
        System.out.println("Attack: "+this.getAttackPoints());
        System.out.println("Element: "+this.getElement());
    }

    public String getElement(){
        return this.element;
    }

    public void setElement(String element){
        this.element = element;
    }

}