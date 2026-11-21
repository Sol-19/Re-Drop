package variants.slime;
import variants.Element;

public class WaterSlime extends SlimeVariant {
    @Override 
    public String name() {return "WaterSlime";}
    public Element element() {return Element.WATER;}
    public int baseAttack() {return 6;}
    public int baseHp() {return 50;}
}
