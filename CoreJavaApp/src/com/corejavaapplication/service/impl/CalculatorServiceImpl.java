package com.corejavaapplication.service.impl;


import com.corejavaapplication.dao.CalculatorDao;
import com.corejavaapplication.dao.impl.CalculatorDaoImpl;
import com.corejavaapplication.service.CalculatorService;

//CalculatorService Lai implement garne..
public class CalculatorServiceImpl implements CalculatorService {

    CalculatorDao calculatorDao = new CalculatorDaoImpl();

    @Override
    public int addition(int a, int b) {
        return calculatorDao.addition(a,b);
    }

    @Override
    public int subtraction(int a, int b) {
        return calculatorDao.subtraction(a,b);
    }

    @Override
    public int multiplication(int a, int b) {
        return calculatorDao.multiplication(a,b);
    }

    @Override
    public int division(int a, int b) {
        return calculatorDao.division(a,b);
    }
}
