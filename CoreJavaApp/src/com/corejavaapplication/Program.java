package com.corejavaapplication;

import com.corejavaapplication.controller.CalculatorController;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        //calculator controller class ko object banaune.
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController(scanner);

        while (true) {
            calculatorController.process();
        }
    }
}

