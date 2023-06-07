package warriors;

import weapons.Weapon;
import weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee>{
    public Infantryman(String name, int healthPoint, Melee weapon) {  // оружие может быть только для ближнего боя
        super(name, healthPoint, weapon);
    }
    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
