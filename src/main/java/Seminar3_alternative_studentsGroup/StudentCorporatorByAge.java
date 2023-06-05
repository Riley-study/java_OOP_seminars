package Seminar3_alternative_studentsGroup;

import java.util.Comparator;

public class StudentCorporatorByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
