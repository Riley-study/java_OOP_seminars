package weapons.rangeWeapon;

public class CrossBow  implements Ranged{
    @Override
    public int damage() {
        return 10;
    }

    @Override
    public int distance() {
        return 100;
    }
}
