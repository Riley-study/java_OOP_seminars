package warriors;

import shield.Shield;
import shield.ShieldForInfantryman;
import weapons.Weapon;
import weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, ShieldForInfantryman>{
    public Infantryman(String name, int healthPoint, Melee weapon, ShieldForInfantryman shield) {  // оружие может быть только для ближнего боя
        super(name, healthPoint, weapon, shield);
    }
    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
