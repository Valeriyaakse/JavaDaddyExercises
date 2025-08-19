package mentorship.roadmap.Java_Core.step4_OOP.topic2_Student;

import mentorship.roadmap.Java_Core.step4_OOP.topic1_Person.Person;

public class Student extends Person {
    private String studentId;
    Student (String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(", Student ID: " + studentId);
    }
}
