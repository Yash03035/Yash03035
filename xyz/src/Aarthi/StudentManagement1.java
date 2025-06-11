package Aarthi;
import java.util.ArrayList;

class Student {
    String name;
    int age;
    int grade;

    Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class StudentManagement1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 18, 85));
        students.add(new Student("Bob", 19, 70));
        students.add(new Student("Charlie", 17, 90));
        students.add(new Student("David", 18, 60));
        students.add(new Student("Eva", 19, 95));

        System.out.println("Students with grade above 80:");
        for (Student s : students) {
            if (s.grade > 80) {
                System.out.println(s.name);
            }
        }
    }
}