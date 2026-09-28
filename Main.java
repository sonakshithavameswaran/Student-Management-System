import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentManagementSystem system = new StudentManagementSystem();

        while (true) {

            System.out.println("\n======================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("======================================");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n----- ADD STUDENT -----");

                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();

                    Student student =
                            new Student(id, name, age, course, marks);

                    system.addStudent(student);

                    break;

                case 2:

                    system.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();

                    system.searchStudent(searchId);

                    break;

                case 4:

                    System.out.println("\n----- UPDATE STUDENT -----");

                    System.out.print("Enter Student ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = scanner.nextLine();

                    System.out.print("Enter New Marks: ");
                    double newMarks = scanner.nextDouble();

                    system.updateStudent(
                            updateId,
                            newName,
                            newAge,
                            newCourse,
                            newMarks
                    );

                    break;

                case 5:

                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();

                    system.deleteStudent(deleteId);

                    break;

                case 6:

                    System.out.println("Thank you for using Student Management System.");
                    scanner.close();
                    return;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}