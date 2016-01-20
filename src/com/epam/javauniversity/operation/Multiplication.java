package com.epam.javauniversity.operation;

public class Multiplication implements Operation {
    @Override
    public int execute(int leftOperand, int rightOperand) {
        return leftOperand * rightOperand;
    }
}
