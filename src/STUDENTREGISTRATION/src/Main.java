import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRegistration registration = new StudentRegistration();

        while (true) {
            System.out.println("\n-------------------------Welcome to Student Registration System by DJ MOMOH----------------------------\n");
            System.out.println("1. Register Student");
            System.out.println("2. Display Registered Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit ");
            System.out.println("\n----------------------------No Make fool oh!----------------------------------------\n");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter student email: ");
                    String email = scanner.nextLine();

                    Student student = new Student(name, age, email);
                    registration.addStudent(student);
                    break;

                case 2:
                    System.out.println("\nRegistered Students:");
                    registration.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter student name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    registration.deleteStudent(nameToDelete);
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
