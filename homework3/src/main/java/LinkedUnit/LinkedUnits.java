package LinkedUnit;

import java.util.*;
import java.util.function.Consumer;

public class LinkedUnits<E> implements Iterable<E>{
    private int size = 0;
    private Unit<E> first;
    private Unit<E> last;

    public void addElement(E element){
        Unit<E> newUnit = new Unit<>(null, null, element);
        if (first==null){
            first = newUnit;
        } else {
          newUnit.previous = last;
          last.next = newUnit;
        }
        last = newUnit;
        size++;
    }

    public void clear(){
        first = null;
        last = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Unit<E> current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }

}
