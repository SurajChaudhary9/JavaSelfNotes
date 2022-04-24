package org.example;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        if(cash < 10)
        {
            System.out.println("Cannot by anything");
        }
        else if(cash > 10 && cash < 50)
        {
            System.out.println("can get one thing");
        }
            else {
                System.out.println("can  get both");
            }
        }

    }
