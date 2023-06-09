package weapons.meleeWeapon;

import shield.Shield;
import shield.ShieldForInfantryman;

public class Axe implements Melee{
    @Override
    public int damage() {
        return 5;
    } // доделать конструктор, расширить функционал

    @Override
    public String toString() {
        return String.format("Axe: %d ", damage());
    }

 }
