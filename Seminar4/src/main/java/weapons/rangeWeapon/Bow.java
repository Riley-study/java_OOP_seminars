package weapons.rangeWeapon;

public class Bow implements Ranged{
    @Override
    public int damage() {
        return 8;
    }

    @Override
    public int distance() {
        return 50   ;
    }
}
