package variants.slime;
import variants.Element;

public class WindSlime extends SlimeVariant {
    @Override 
    public String name() {return "WindSlime";}
    public Element element() {return Element.WIND;}
    public int baseAttack() {return 10;}
    public int baseHp() {return 30;}
}
