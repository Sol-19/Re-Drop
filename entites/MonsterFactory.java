package entites;

import exceptions.InvalidMonsterException;

public class MonsterFactory{

    Entity newentity;
    MonsterFactory(String element, String entity) throws InvalidMonsterException{
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
