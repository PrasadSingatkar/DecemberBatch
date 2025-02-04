package SMS;

import java.util.HashMap;

public class StudentOperationsImpl implements StudentOperations{
   // Using a hashmap to store student objects with their IDs
    private HashMap<Integer, Student> studentMap = new HashMap<>();

    @Override
    public void addStudent(Student student) {
      // to   add student to a map
        studentMap.put(student.getId(),student);
        System.out.println("Student Added Successfully!");
    }

    @Override
    public Student getStudent(int id) {
        return studentMap.get(id);
    }

    @Override
    public void updateStudent(int id, Student updatedStudent) {
            // check if the student exists in map
        if (studentMap.containsKey(id)){
            studentMap.put(id, updatedStudent);
            System.out.println("Student Updated Successfully!");
        } else {
            System.out.println("Student Not Found! ");
        }
    }

    @Override
    public void deleteStudent(int id) {
        // To remove the student
        if(studentMap.remove(id) != null){
            System.out.println("Student Deleted Successfully! ");
        } else {
            System.out.println("Student Not Found!!");
        }
    }

    @Override
    public void displayAllStudents() {
        if (studentMap.isEmpty()){
            System.out.println("No Students to display");
        } else {
            for(Student student : studentMap.values()){
                System.out.println(student);
            }
        }
    }
}
