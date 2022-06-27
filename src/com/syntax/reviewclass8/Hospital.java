package com.syntax.reviewclass8;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("Jane", "Smith");
        doc.printInfo();
        Doctor.hospital="UCSF";
        doc.work();

        System.out.println("---------------------");

        Doctor doctor=new Doctor("Joe", "Doe", "cardiologist", 10);
        doctor.printInfo();
        doctor.work();

        System.out.println("---------------------");

        Doctor.hospital="George Washington";
        doc.work();
        doctor.work();

        System.out.println("---------------------");

        doc.lastName="Obama";
        doc.printInfo();
        doctor.printInfo();

        System.out.println("---------------------");

        doc.hospital="Mayo Clinic";
        doc.work();
        doctor.work();

        System.out.println("---------------------");

        doctor.treat("Samantha");

        System.out.println("---------------------");

        //Doctor.study();
    }
}
