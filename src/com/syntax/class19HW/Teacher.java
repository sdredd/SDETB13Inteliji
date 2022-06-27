package com.syntax.class19HW;

public class Teacher {
    /* Write a Java program called Teacher.
    Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    that would have it their own features and behaviour. Test all 4 classes
     */
    String name;
    int age;
    String degree;

    void teach () {
        System.out.println(name+" age "+age);
    }

}

class MathTeacher extends Teacher {
String specialMathSubject;
public void teachesMath () {
    System.out.println(name+ " age "+age+" teacher Math favorite subject "+specialMathSubject);
}
}

class ChemistryTeacher extends Teacher {
String favoriteChem;
        public void teachesChemistry() {
    System.out.println(name+" teaches Chemistry and his favorite "+favoriteChem);
}
}

class PianoTeacher extends Teacher {

}

class Task3 {

    public static void main(String[] args) {
        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Adem";
        chemistryTeacher.favoriteChem="Organic";
        chemistryTeacher.teachesChemistry();

    }
}