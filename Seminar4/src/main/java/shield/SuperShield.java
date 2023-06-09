package shield;

public class SuperShield implements ShieldForMelee{
    @Override
    public int protection() {
        return 20;
    }
    public String toString() {
        return String.format("SuperShield: %d ", protection());
    }
}
