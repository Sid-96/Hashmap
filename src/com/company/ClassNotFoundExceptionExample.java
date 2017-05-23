package com.company;

/**
 * Created by siddharthsinhrana on 23/05/17.
 */


/**
 * Example of ClassNotFoundException
 */

public class ClassNotFoundExceptionExample {

    public static void main(String[] args){
        try {
            Class cls = Class.forName("com.company.Hashmap");
            System.out.println(cls.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
