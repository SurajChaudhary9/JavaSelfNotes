package org.example;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] marks = new int[3]; //new because non-primitive
        marks[0] = 100;
        marks[1] = 99;
        marks[2] = 99;
        System.out.println(marks[2]);
        //if commented marks 6,7,8 line o/p will be 0
        System.out.println(marks.length); //length 3
        System.out.println(marks[0]);//prints 95 before sort
        Arrays.sort(marks);
        System.out.println(marks[0]);//prints 95 in ascending order after sort

    }
}
