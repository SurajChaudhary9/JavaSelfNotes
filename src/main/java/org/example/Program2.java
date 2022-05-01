package org.example;
//Switch Statement / Case Statement
public class Program2 {
    public static void main(String[] args) {
        int day = 2;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Thursday to sunday");
        }
    }
}
//Notes :
/*Break statment gives individual block output and exists loops
o/p will be  tuesday wednesday Thursday as value matches 2;
now the default statment matches if nothing vale found ;for eg invalid input

 */