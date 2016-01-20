package com.epam.javauniversity.operation;

public class Addition implements Operation {
    @Override
    public int execute(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }
}
