package org.example;
public class Start {
    //Non Primitive Data-Types
    public static void main(String[] args) {
        //Non primitive
        String name = "Aman";

        System.out.println(name.length());
        //size in infinite upto memory // length is funcn returns length
        System.out.println("O/P 1 :"+name.length());
        //"O/P 1 :"+name.length() - COBINING TWO SOP'S USING "" +

        //new keywords are using to create object of classes
        //reference
        System.out.println(name.charAt(1)); //charAt print m ...index starts from 0
        String name2 = name.replace('m','l');//replace
        System.out.println(name2);
        System.out.println(name);//string are immutable(does not change)

        //Index print from a string
        String name3 = "Karan and Arjun";
        System.out.println(name3.substring(0,5));//karan
        System.out.println(name3.substring(6,10));//and

    }
}
