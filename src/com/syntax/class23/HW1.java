package com.syntax.class23;

public class HW1 {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
    public static void main(String[] args) {

        Student [] students={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (Student s:students) {
            s.printInfo();
            s.grade();
            System.out.println("-----------------------");
        }

        /*Student student=new SyntaxStudent();
        student.printInfo();
        student.grade();

        student=new CollegeStudent();
        student.printInfo();
        student.grade();*/
    }
}

class Student {
    String name;
    int age;

    void printInfo () {
        System.out.println("Name " +name+ " age "+age);
    }

    void grade() {
        System.out.println("Grade 5 classes");
    }
}

class SyntaxStudent extends Student {
    void printInfo (String school) {
        System.out.println("Name " +name+ " age "+age+"study at "+school);
    }

    void grade() {
        System.out.println("Grade 12 classes");
    }
}

class CollegeStudent extends Student {
    void printInfo (String school) {
        System.out.println("Name " +name+ " age "+age+"study at "+school);
    }

    void grade() {
        System.out.println("Grade 8 classes");
    }
}

class SchoolStudent extends Student {
    void printInfo () {
        System.out.println("Name " +name+ " age "+age+"study at school");
    }

}
