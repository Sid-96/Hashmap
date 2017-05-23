package com.company;

/**
 * Created by siddharthsinhrana on 23/05/17.
 */
public class NoClassDefFoundErrorExample {
    public static void main(String[] args){

        try{
            SomeUselessClass object = new SomeUselessClass();       // This throws ExceptionInInitializeError
        }
        catch(Throwable t){
            t.printStackTrace();
        }
        try{
            SomeUselessClass object1 = new SomeUselessClass();      // Due to above error this throws NoClassDefFoundError
        }
        catch(Throwable t){
            t.printStackTrace();
        }
    }
}
class SomeUselessClass{

    public static int someAttribute = someMethod();



    private static int someMethod(){
       throw new RuntimeException("Test runtime exception");
    }
}
