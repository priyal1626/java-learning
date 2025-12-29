package p1;

// Parent class
class Person {
    String name;
    int age;

    void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class 1
class Student extends Person {
    int rollNo;

    void showStudent() {
        System.out.println("Roll No: " + rollNo);
    }
}

// Child class 2
class Teacher extends Person {
    String subject;

    void showTeacher() {
        System.out.println("Subject: " + subject);
    }
}

// Main class
public class HierarchicalInheritance {

    public static void main(String[] args) {

        // Student object
        Student s = new Student();
        s.name = "Priyal";
        s.age = 19;
        s.rollNo = 37;

        System.out.println("Student Details:");
        s.showPerson();
        s.showStudent();

        System.out.println();

        // Teacher object
        Teacher t = new Teacher();
        t.name = "Dr. Sharma";
        t.age = 45;
        t.subject = "Physics";

        System.out.println("Teacher Details:");
        t.showPerson();
        t.showTeacher();
    }
}
