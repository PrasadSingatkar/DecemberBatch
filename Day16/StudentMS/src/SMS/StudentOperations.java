package SMS;

public interface StudentOperations {
    void addStudent(Student student);  // Add new Student
    Student getStudent(int id);
    void updateStudent(int id, Student updatedStudent);
    void deleteStudent(int id);
    void displayAllStudents();
}
