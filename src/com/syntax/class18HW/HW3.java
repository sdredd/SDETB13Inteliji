package com.syntax.class18HW;

public class HW3 {
    /* Create a method that will accept a String as
    a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was
    declared and executed by calling it is name.
     */
    private static String vowelsString (String a) {

        // return a.replaceAll("[^aeiou]", ""); shortest way
        StringBuilder n=new StringBuilder();
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i)=='a' || a.charAt(i)=='o' || a.charAt(i)=='e' ||a.charAt(i)=='i' ||a.charAt(i)=='u') {
                n.append(a.charAt(i));
            }
        }
        return n.toString();
    }

    public static void main(String[] args) {
        System.out.println(vowelsString("Natalia"));
    }



}
