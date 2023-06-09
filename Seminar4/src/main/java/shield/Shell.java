package shield;

public class Shell implements ShieldForInfantryman {
    @Override
    public int protection() {
        return 15;
    }

    public String toString() {
        return String.format("Shield: %d ", protection());
    }
}
