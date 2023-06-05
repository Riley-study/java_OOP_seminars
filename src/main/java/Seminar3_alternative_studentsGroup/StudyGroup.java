package Seminar3_alternative_studentsGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>{
    private List <Student> students;
    private int numGroup;
public StudyGroup(){
    students = new ArrayList<>();
}

    public void addStudent (Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getNumGroup() {
        return numGroup;
    }

    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }

    public void sort(){
        Collections.sort(students);  //стандартный функционал не знает по кауому признаку сравнивать,
        // переопределяем в классе Студенты
    }

    public void sortByAge(){
    students.sort(new StudentCorporatorByAge());
    }
    public void sortByName(){
        students.sort(new StudentCorporatorByName());
    }

//    class StudentIterator implements Iterator<Student>{
//        private int index;
//
//        @Override
//        public boolean hasNext() {
//            return students.size() > index;
//        }
//
//        @Override
//        public Student next() {
//            return students.get(index++);   //выдает сначала первого студента с инд 0, затем увеличивает индекс
//        }
//    }
}
