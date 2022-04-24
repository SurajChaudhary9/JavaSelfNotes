package org.example;

public class Conditional {
    public static void main(String[] args) {
        //conditional statement    boolean sunUp = true;
        boolean isAdult = true;
        if (!isAdult)//by default assumes false implicitly using !
            System.out.println("Its a Adult");
        else
            System.out.println("Not Adult");

        //Logical Operators
//        int a = 50;
//        int b = 110;
////        if(a < 100 && b < 100) //AND operator both condition should be true to enter if loop
////            System.out.println("Both are Less than 100");
////        else
////            System.out.println("Either one is more than 100");
//        if(a < 100 || b < 100) //OR operator Atleast one should be true
//            System.out.println("Either one is True");
//        else
//            System.out.println("None is true");
    }
}
