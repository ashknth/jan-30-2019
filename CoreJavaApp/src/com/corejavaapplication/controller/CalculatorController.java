package com.corejavaapplication.controller;

import com.corejavaapplication.service.CalculatorService;
import com.corejavaapplication.service.impl.CalculatorServiceImpl;

import java.util.Scanner;

public class CalculatorController {
    //menu ho
    Scanner scanner;  //instance variable ho
    CalculatorService calculatorService = new CalculatorServiceImpl();

    public CalculatorController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {

        System.out.println("1.Addition.");
        System.out.println("2.Subtraction.");
        System.out.println("3.Multiplication.");
        System.out.println("4.Division.");
        System.out.println("5.Exit.");
    }

    public void process() {
        this.menu();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                add();

                break;
            case 2:
                sub();
                break;
            case 3:
                mul();
                break;
            case 4:
                div();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong input.");

        }
    }

    public void add() {
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter another number");
        int b = scanner.nextInt();
        System.out.println("The sum is:" + calculatorService.addition(a, b));

    }

    public void sub() {
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter another number");
        int b = scanner.nextInt();
        System.out.println("The difference is:" + calculatorService.subtraction(a, b));

    }

    public void mul() {
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter another number");
        int b = scanner.nextInt();
        System.out.println("The multiplication is:" + calculatorService.multiplication(a, b));

    }

    public void div() {
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter another number");
        int b = scanner.nextInt();
        System.out.println("The division is:" + calculatorService.division(a, b));

    }

}
