package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String first = "Bob";
        String last = "Smith";
        String fullName;

        fullName = formatName(first, last);
        System.out.println(fullName);
    }

    public static String formatName(String first, String last){
        return last + ", " + first;
    }
}