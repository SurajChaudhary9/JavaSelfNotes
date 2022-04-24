package org.example;

public class Conditional {
    public static void main(String[] args) {
        //conditional statement    boolean sunUp = true;
//        boolean sunUp = true;
//        if (sunUp == true)
//            System.out.println("Its a Day");
//        else
//            System.out.println("Its night");

        //Logical Operators
        int a = 50;
        int b = 110;
//        if(a < 100 && b < 100) //AND operator both condition should be true to enter if loop
//            System.out.println("Both are Less than 100");
//        else
//            System.out.println("Either one is more than 100");
        if(a < 100 || b < 100) //OR operator Atleast one should be true
            System.out.println("Either one is True");
        else
            System.out.println("None is true");
    }
}
