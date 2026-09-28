import java.util.ArrayList;

public class StudentManagementSystem {

    // ArrayList stores all students
    private ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {

        students.add(student);

        System.out.println("Student added successfully.");
    }

    // View all students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n========== STUDENT LIST ==========");

        for (Student student : students) {
            student.displayStudent();
        }
    }

    // Search student by ID
    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {

                System.out.println("\nStudent found:");
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student with ID " + id + " not found.");
    }

    // Update student
    public void updateStudent(int id, String name, int age,
                              String course, double marks) {

        for (Student student : students) {

            if (student.getId() == id) {

                student.setName(name);
                student.setAge(age);
                student.setCourse(course);
                student.setMarks(marks);

                System.out.println("Student details updated successfully.");
                return;
            }
        }

        System.out.println("Student with ID " + id + " not found.");
    }

    // Delete student
    public void deleteStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {

                students.remove(student);

                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student with ID " + id + " not found.");
    }
}