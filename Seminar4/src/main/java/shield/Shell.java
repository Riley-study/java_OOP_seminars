package shield;

public class Shell implements Shield {
    @Override
    public int protection() {
        return 50;
    }

    public String toString() {
        return String.format("Shield: %d ", protection());
    }
}
