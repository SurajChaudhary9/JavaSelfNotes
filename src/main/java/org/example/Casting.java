package org.example;

public class Casting {
    public static void main(String[] args) {
        //casting
        double price = 100;
        double finalPrice = price + 18; //allows int in double
        System.out.println(finalPrice);
        int p =100;
        int fp = p + (int)18.0; //does not allow double in int
        //use(int) for acceptance
        System.out.println(fp);

        //constants
//        int age =30;
//        age= 31;    //here values can change as it is not a constant
        final float PI = 3.14F;
        //PI = 1.1F; //NOW THIS WILL GIVE WARNING AS (final) keyword is used
    }
}
