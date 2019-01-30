package com.corejavaapplication.dao.impl;

import com.corejavaapplication.dao.CalculatorDao;

public class CalculatorDaoImpl implements CalculatorDao {   //Alt enter thichne method define garna
    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }

}
