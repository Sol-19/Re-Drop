package entities;

import variants.Element;
import variants.slime.SlimeVariant;

public class Slime extends Entity {
    private SlimeVariant variant;

    Slime(SlimeVariant variant) {
        super(variant.baseHp(), variant.baseAttack());
        this.variant = variant;
    }

    public void setVariant(SlimeVariant variant) {
        this.variant = variant;
        this.setAttackPoints(variant.baseAttack());
    }

    @Override
    public void repr() {
        System.out.println("Name: " + variant.name());
        System.out.println("HP: " + this.getHealthPoints());
        System.out.println("Attack: " + this.getAttackPoints());
        System.out.println("Element: " + this.getElement());
    }

    public Element getElement() {
        return variant.element();
    }
}
