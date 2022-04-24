package org.example;

public class HashMap<S, I extends Number> {
    public static void main(String[] args){
        //map of employee name to id numbers
//        HashMap empId = new HashMap();

        HashMap<String, Integer> empId = new HashMap<>();
        empId.put("Suraj", 1235);
        System.out.println(empId);
    }
}
