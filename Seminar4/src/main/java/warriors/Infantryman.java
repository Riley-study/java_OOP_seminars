package warriors;

import shield.Shield;
import weapons.Weapon;
import weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, Shield>{
    public Infantryman(String name, int healthPoint, Melee weapon, Shield shell) {  // оружие может быть только для ближнего боя
        super(name, healthPoint, weapon, shell);
    }
    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
