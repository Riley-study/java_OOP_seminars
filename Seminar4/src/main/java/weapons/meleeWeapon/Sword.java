package weapons.meleeWeapon;

public class Sword implements Melee{
    @Override
    public int damage() {
        return 4;
    }
    public String toString() {
        return String.format("Sword: %d ", damage());
    }
}
