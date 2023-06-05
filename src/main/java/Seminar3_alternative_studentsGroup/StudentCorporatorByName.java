package Seminar3_alternative_studentsGroup;

import java.util.Comparator;

public class StudentCorporatorByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


