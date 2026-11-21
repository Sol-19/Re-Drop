package entities;

import exceptions.InvalidMonsterException;
import variants.slime.EarthSlime;
import variants.slime.FireSlime;
import variants.slime.NormalSlime;
import variants.slime.SlimeVariant;
import variants.slime.WaterSlime;
import variants.slime.WindSlime;

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
                newentity = new Slime(slimeVariant(element));
                break;
            default:
                throw new InvalidMonsterException("The entity "+entity+" does not exist in our game gng");
        }
    }

    public Entity getEntity(){
        return this.newentity;
    }

    public static SlimeVariant slimeVariant(String element) {
        return switch (element) {
            case "fire" -> new FireSlime();
            case "water" -> new WaterSlime();
            case "earth" -> new EarthSlime();
            case "wind" -> new WindSlime();
            case "none", "normal" -> new NormalSlime();
            default -> throw new InvalidMonsterException("The element " + element + " does not exist in our game gng");
        };
    }

}
