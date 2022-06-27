package com.syntax.class24;

public class HW1 {
    /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile,
    PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text,
    to open .doc file we need Microsoft word to be installed etc
     */
    public static void main(String[] args) {

        File[] files = {new JavaFile(), new PdfFile(), new WordFile()};

        for (File f : files) {
            f.open();
            f.edit();
            f.close();
        }
    }
}

abstract class File {

    abstract void open();

    void edit() {
        System.out.println("Edit");}

    void close() {
        System.out.println("close");}
}

class JavaFile extends File {
    @Override
    void open() {
        System.out.println("we need notepad++ or sublime text");
    }
}

class WordFile extends File {
    @Override
    void open() {
        System.out.println("we need Microsoft word to be installed");
    }
}

class PdfFile extends File {
    @Override
    void open() {
        System.out.println("we need PDF");
    }
}
