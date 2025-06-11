package xyz;
public class Student {
    private String name;
    private int rollno;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String checkResult() {
        if (marks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public void displayDetails() {
        System.out.println("Roll no: " + getRollno());
        System.out.println("Name: " + getName());
        System.out.println("Marks: " + getMarks());
        System.out.println("Result: " + checkResult());
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Rohit");
        s1.setMarks(46);
        s1.setRollno(9);
        s1.displayDetails();
    }
}