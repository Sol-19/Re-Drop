package variants.slime;
import variants.Element;

public class NormalSlime extends SlimeVariant {
    @Override 
    public String name() {return "NormalSLime";}
    public Element element() {return Element.NORMAL;}
    public int baseAttack() {return 7;}
    public int baseHp() {return 45;}
}
