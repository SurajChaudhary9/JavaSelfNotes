package org.example;

public class Operators {
    //Arithmatic Operators
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        int add=a+b;
        int sub=b-a;
        int mul=a*b;
        int div=b/a;
        double x = 20;
        double y = 10;
        double div1=y/x;
        double modulo = a % b; //mod - remainder
        System.out.println("Addition is :"+add);
        System.out.println("Subtraction is : "+sub);
        System.out.println("Multiplication is :"+mul);
        System.out.println("Division is :"+div);
        System.out.println("Division is for double:"+div1);//returns in decimal
        System.out.println("Modulo is :"+modulo);

        //Unary Operators
        int number = 1;
        System.out.println(number++);//2 1+1
        System.out.println(++number);//3 2+1
        System.out.println(number--);//3 no change
        System.out.println(number);//2 3-2

        //Comparison Operators
        //a == b
        //a !=b
        //a<b
        //a >b
        //a<=b
        //a>=b
        
    }
}
