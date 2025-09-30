package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        //This is where I declare all my numbers
        int num = 20;
        double num2 = -2;

        //calling and printing the methods
        System.out.println(isEven(num));
        System.out.println(isPositive(num2));
    }

    //is even method
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    //is positive method
    public static boolean isPositive(double num){
        return num > 0;
    }

}
