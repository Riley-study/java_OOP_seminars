package Seminar3_alternative_studentsGroup;

public class StudyGroupService {
    private StudyGroup group;
    private static int id;

    public StudyGroupService(StudyGroup group) {
        this.group = group;
    }

    public void addStudent(String name, int age) {
        group.addStudent(new Student(id++, name, age));
    }
}
