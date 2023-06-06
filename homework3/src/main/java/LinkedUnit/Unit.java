package LinkedUnit;

public class Unit<E> {
    Unit<E> previous;
    Unit<E> next;
    E element;

    public Unit(Unit<E> previous, Unit<E> next, E element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }
}
