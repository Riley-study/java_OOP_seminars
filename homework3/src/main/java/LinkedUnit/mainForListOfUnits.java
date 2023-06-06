package LinkedUnit;

public class mainForListOfUnits {
//    Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем iterable интерфейс.
//    Список должен содержать элементы со ссылкой на следующий элемент (если показалось мало, то реализовать
//    ссылку и на предыдущий элемент)
    public static void main(String[] args) {
        LinkedUnits<Integer> listOfUnits = new LinkedUnits<>();
        listOfUnits.addElement(1);
        listOfUnits.addElement(2);
        listOfUnits.addElement(3);
        listOfUnits.addElement(4);

        System.out.println("Список элементов с использованием iterable интерфейс: ");
        for (Integer element: listOfUnits) {
            System.out.println(element);
        }

        System.out.println("Размер списка: " + listOfUnits.size());
        listOfUnits.clear();
        System.out.println("Размер списка после вызова метода clear: " + listOfUnits.size());
    }
}
