package com.syntax.class18HW;

public class HW9 {
    /*
    Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    String author;
    int pageCount;

    HW9 (String author) {
        this.author=author;
    }

    HW9 (String author, int pageCount) {
        this.author=author;
        this.pageCount=pageCount;
    }

    public static void main(String[] args) {
        HW9 hw9=new HW9("Hemingay");
        HW9 java=new HW9("No know", 5000);
    }

}
