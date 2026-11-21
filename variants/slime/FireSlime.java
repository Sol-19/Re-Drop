package variants.slime;
import variants.Element;

public class FireSlime extends SlimeVariant {
    @Override 
    public String name() {return "FireSlime";}
    public Element element() {return Element.FIRE;}
    public int baseAttack() {return 8;}
    public int baseHp() {return 40;}

}
 