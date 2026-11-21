package variants.slime;
import variants.Element;

public class EarthSlime extends SlimeVariant {
    @Override 
    public String name() {return "EarthSlime";}
    public Element element() {return Element.EARTH;}
    public int baseAttack() {return 5;}
    public int baseHp() {return 60;}
}
