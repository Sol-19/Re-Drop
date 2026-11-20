package entites;

import exceptions.InvalidMonsterException;

public class MonsterFactory{
    /*
    Summary:
    This is the class you use to create monsters. Pass in an element and a monster type,
    then call getEntity() to get the monster back.

    Example:
    Entity slime01 = new MonsterFactory("fire", "slime").getEntity();

    Valid elements: fire, water, earth, wind, none
    Valid monster types: slime
    NOTE: entity2, entity3 and entity4 are placeholders and still create a Slime for now.

    getEntity() returns an Entity, so to call a monster-specific method (like setElement)
    you have to cast it first: ((Slime) slime01).setElement("water");

    Throws InvalidMonsterException if the monster type or the element does not exist.
     */
    Entity newentity;
    public MonsterFactory(String element, String entity) throws InvalidMonsterException{
        switch (entity){
            case "slime":
                newentity = new Slime(element);
                break;
            case "entity2":
                newentity = new Slime(element);
                break;
            case "entity3":
                newentity = new Slime(element);
                break;
            case "entity4":
                newentity = new Slime(element);
                break;
            default:
                throw new InvalidMonsterException("The entity "+entity+" does not exist in our game gng");
        }
    }

    public Entity getEntity(){
        return this.newentity;
    }
}
