package com.knoldus;



public class Calculator {
    public static void main(String[] ar) {
        System.out.println("This is java file in scala project");
        System.out.println(subtraction(12,10));
        System.out.println(division(12,0));

        Storage storage = new Storage();
        storage.addElement(4);
        storage.addElement(5);
        storage.addElement(8);
        storage.addElement(9);

        System.out.println(storage.removeElement(2));
//        System.out.println(storage.list.removeAll());
        System.out.println(storage.checkIfContains(8));




    }
    public static double subtraction(double firstValue, double secondValue){
        return firstValue - secondValue;
    }

    public static double addition (double firstValue, double secondValue){
        return firstValue + secondValue;
    }

    public static double multiplication(double firstValue, double secondValue){
        return  firstValue * secondValue;
    }

    public static double division(double firstValue, double secondValue){
        double result = 0;
        try{
             result = firstValue/ secondValue;
        } catch (ArithmeticException e) {
            return 0;
        }
        return result;
    }

}
