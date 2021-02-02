package com.example.springnew;

import java.util.Scanner;

public class Calculator implements ICalculator{

    public int add(String... numbers) {

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

    public static void main(String[] args) {
        int result = 0;

        String inputNumber;
        String operation;

        Calculator calculator = new Calculator();

        Scanner scanObject = new Scanner(System.in);

        System.out.println("please enter numbers seperated by space");

        inputNumber =scanObject.nextLine();
        String[] numbers = inputNumber.split("\\s");
        System.out.println("what operation");
        operation = scanObject.next();
        scanObject.close();

        switch (operation) {

            case "add" : result = calculator.add(numbers);
                break;

            case "substract" : result = calculator.substract(numbers);
                break;

            case "multiply" : result = calculator.multiply(numbers);
                break;


        }
        System.out.println(result);
    }


}
