package com.syntax.reviewclass8;

public class Doctor {
    public String firstName, lastName, speciality;
    protected int experience;
    private double salary;
    static String hospital;

    public Doctor (String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    Doctor (String firstName, String lastName, String speciality, int experience) {
        this(firstName, lastName);
        this.speciality=speciality;
        this.experience=experience;
    }

    public void printInfo() {
        System.out.println("Doctor name is "+firstName+" "+lastName+" "
        +"and speciality is "+speciality);
    }

    protected void work() {
        System.out.println("Doctor "+lastName+" works at "+hospital);
    }

    void treat(String patientName) {
        printInfo();
        System.out.println("Treat patient "+patientName);
    }

    private void getPaid() {
        System.out.println("Doctor "+lastName+" "+salary);
    }

    /*static void study(String university) {
        System.out.println("Doctor studied at "+university+" and now works at "+hospital);
    }*/
}
