package com.factory.factoryMethod.operateImpl;

import com.factory.factoryMethod.Operate;

public class OperateMul implements Operate {
    public double calcuate(double num1, double num2) {
        return num1*num2;
    }
}
