package com.syntax.reviewclass7;

public class B13String {
    private String str;
    public B13String(String str) {
        this.str=str;
    }

    public int countChats(char c) {
        int counter=0;
        for (char cha:str.toCharArray()) {
            if (cha==c) {
                counter++;
            }
        }
        return counter;
    }

    public void printChars(char c) {
        int counter=0;
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i)==c) {
                counter++;
            }
        }
        System.out.println(c+" has appeared "+counter);
    }
}
