package entites;

import exceptions.InvalidEntityException;

public class EntityFactory{
    Entity newentity;
    EntityFactory(String element, String entity) throws InvalidEntityException{
        switch (entity){
            case "entity1":
                //newentity = new entity1()
                break;
            case "entity2":
                 //newentity = new entity2()
                break;
            case "entity3":
                //newentity = new entity3()
                break;
            case "entity4":
                //newentity = new entity4()
                break;
            default:
                throw new InvalidEntityException("The entity "+entity+" does not exist in our game gng");
        }
        switch (element){
            case "fire":
                //newentity = new entity1()
                break;
            case "water":
                 //newentity = new entity2()
                break;
            case "earth":
                //newentity = new entity3()
                break;
            case "wind":
                //newentity = new entity4()
                break;
            default:
                throw new InvalidEntityException("The element "+element+" does not exist in our game gng");
        }
    }
    public Entity getEntity(){
        return this.newentity;
    }
}
