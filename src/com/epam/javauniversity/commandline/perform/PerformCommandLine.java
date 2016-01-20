package com.epam.javauniversity.commandline.perform;

import com.epam.javauniversity.commandline.parser.ParserCommandLine;
import com.epam.javauniversity.operation.Operation;

public class PerformCommandLine {
    private int resultPerform;

    public PerformCommandLine(String[] args) throws Exception {
        ParserCommandLine parser = new ParserCommandLine(args);
        Operation operation = parser.getOperation();
        resultPerform = operation.execute(parser.getLeftOperand(), parser.getRightOperand());
    }

    public int getResultPerform() {
        return resultPerform;
    }
}
