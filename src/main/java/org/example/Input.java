package org.example;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Your Age");
        int age = sc.nextInt();//for int
        System.out.println(age);
        System.out.println("enter your cgpa");
        double cgpa=sc.nextDouble();//for double
        System.out.println(cgpa);
        System.out.println("Enter Your name");
        String name = sc.next();//only returns one string
        //for eg : karan arjun ...o/p karan ( single token)
        System.out.println(name);
        String fullName = sc.nextLine();//returns karan arjun
        System.out.println(fullName);

    }

}
