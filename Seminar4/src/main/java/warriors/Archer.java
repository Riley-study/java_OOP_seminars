package warriors;

import weapons.Weapon;
import weapons.rangeWeapon.Ranged;

public class Archer extends Warrior{
    public Archer(String name, int healthPoint, Ranged weapon) { // поменяли тип оружия на Ranged чтобы ограничить выбор оружия у лучника
        super(name, healthPoint, weapon);
    }

    public int distance(){
        return ((Ranged)super.getWeapon()).distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d", super.toString(), distance());
    }
}
