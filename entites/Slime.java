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

}