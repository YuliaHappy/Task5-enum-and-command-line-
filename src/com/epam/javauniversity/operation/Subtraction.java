package com.epam.javauniversity.operation;

public class Subtraction implements Operation {
    @Override
    public int execute(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }
}
