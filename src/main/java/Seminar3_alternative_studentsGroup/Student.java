package Seminar3_alternative_studentsGroup;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: " + "id= " +id + ". name= " + name + ", age " + age;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name); // берет имя студента, сравнивает с текущим именем "о" и сортирует
        // по алфавиту (то есть сделали класс сортируемым по параметру name)
    }
}
