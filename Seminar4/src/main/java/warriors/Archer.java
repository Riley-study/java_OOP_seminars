package warriors;

import shield.Shield;
import weapons.Weapon;
import weapons.rangeWeapon.Ranged;

public class Archer extends Warrior<Ranged, Shield>{
    public Archer(String name, int healthPoint, Ranged weapon, Shield shell) { // поменяли тип оружия на Ranged чтобы ограничить выбор оружия у лучника
        super(name, healthPoint, weapon, shell);
    }

    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d", super.toString(), distance());
    }
}
