package shield;

public class Shell implements Shield {
    @Override
    public int protection() {
        return 10;
    }

    public String toString() {
        return String.format("Shell: %d ", protection());
    }
}
