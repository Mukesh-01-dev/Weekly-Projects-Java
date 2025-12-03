import java.util.HashMap;

public class StudentManager {
    HashMap<Integer, Student> studentData;

    StudentManager() {
        studentData = new HashMap<Integer, Student>();
    }

    void addStudent(int id, String name, int age, String course, float marks) {
        Student student = new Student(id, name, age, course, marks);
        studentData.put(id, student);
    }

    void viewStudents() {
        for (Student s : studentData.values()) {
            System.out.println(s);
        }
    }
    // Functions
    // addStudent()
    // viewStudents()
    // searchStudent()
    // updateStudent()
    // deleteStudent()
    // statistics()
}
