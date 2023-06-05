package Seminar3_alternative_studentsGroup;

public class MainForStudyGroup {
    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        StudyGroupService service = new StudyGroupService(studyGroup);
//        studyGroup.addStudent(new Student(1, "Vasya", 23))
//                .addStudent(new Student(2, "Vanya", 25))
//                .addStudent(new Student(3, "Katya", 21));
       service.addStudent("Anya", 22);
       service.addStudent("Petya", 20);
       service.addStudent("Vasya", 21);
       service.addStudent("Olga", 24);
       service.addStudent("Kira", 23);

        for (Student student: studyGroup) {
            System.out.println(student);
        }
        System.out.println("Отсортированы по алфавиту");
studyGroup.sortByName();
        for (Student student: studyGroup) {
            System.out.println(student);
        }
        System.out.println("Отсортированы по возрасту");
        studyGroup.sortByAge();
        for (Student student: studyGroup) {
            System.out.println(student);
        }

    }
}

