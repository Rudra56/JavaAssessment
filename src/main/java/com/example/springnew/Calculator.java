package com.example.springnew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Calculator implements ICalculator{

    public int add(String... numbers)
    {

        int result = 0;
        for(String number : numbers) {
            result+=Integer.parseInt(number);
        }
        return result;
    }

    public int substract(String... numbers) {

        int result = 0;
        for(String number : numbers) {
            result-=Integer.parseInt(number);
        }
        return result;
    }

    public int multiply(String... numbers) {
        int result = 1;
        for(String number : numbers) {
            result*=Integer.parseInt(number);
        }
        return result;
    }

    public static boolean isNumber(String... input){

        for(String s : input){
            for(int i=0;i<s.length();i++){
                if(!Character.isDigit(s.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int result = 0;

        String inputNumber;
        String operation;

        Calculator calculator = new Calculator();
        Scanner scanObject = new Scanner(System.in);
        System.out.println("please enter numbers seperated by space");
        inputNumber =scanObject.nextLine();
            String[] numbers = inputNumber.split("\\s");
            if(isNumber(numbers))
            {
            System.out.println("what operation");
            operation = scanObject.next();
            scanObject.close();
            switch (operation) {

                case "add":
                    result = calculator.add(numbers);
                    break;

                case "substract":
                    result = calculator.substract(numbers);
                    break;

                case "multiply":
                    result = calculator.multiply(numbers);
                    break;


            }

            System.out.println(result);
        }
        else {
            System.out.println("enter a numeric number instead of an alphabet");
        }
    }


}
