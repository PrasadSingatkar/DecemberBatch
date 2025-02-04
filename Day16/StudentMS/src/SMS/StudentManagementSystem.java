package SMS;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentOperations operations = new StudentOperationsImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Welcome to SMS: ");
            System.out.println("1. Add Student ");
            System.out.println("2. Get Student By ID ");
            System.out.println("3. Update Student ");
            System.out.println("4. Delete Student ");
            System.out.println("5. Display All Students ");
            System.out.println("6. Exit ");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Your Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter your course: ");
                    String course = scanner.nextLine();
                    operations.addStudent(new Student(id,name,age,course));
                    break;

                case 2:
                    // Get student by ID
                    System.out.println("Enter student ID to display student object: ");
                    id = scanner.nextInt();
                    Student student = operations.getStudent(id);
                    if(student != null){
                        System.out.println(student);
                    }else{
                        System.out.println("Student Not Found");
                    }
                    break;

                case 3:
                    System.out.println("Enter Student ID to update: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter New Name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter New Age: ");
                    age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter New Course: ");
                    course = scanner.nextLine();
                    operations.updateStudent(id, new Student(id,name, age, course));
                    break;

                case 4:
                    System.out.println("Enter Student ID to delete:  ");
                    id = scanner.nextInt();
                    operations.deleteStudent(id);
                    break;

                case 5:
                    operations.displayAllStudents();
                    break;

                case 6:
                    System.out.println("Good Bye!!!!!");
                    break;

                default:
                    System.out.println("Invalid Choice !!");
            }

        }while(choice != 6);
    }
}
