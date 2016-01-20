package com.epam.javauniversity.commandline.parser;

import com.epam.javauniversity.operation.*;
import org.apache.commons.cli.*;

public class ParserCommandLine {
    private int leftOperand;
    private int rightOperand;
    private Operation operation;

    public ParserCommandLine(String[] args) throws Exception {
        if (args == null || args.length != 6) {
            throw new Exception("false size command line");
        }

        Options options = new Options();
        options.addOption("l", true, "left operand");
        options.addOption("r", true, "right operand");
        options.addOption("o", true, "operation");

        CommandLineParser parser = new PosixParser();
        CommandLine commandLine = parser.parse(options, args);


        leftOperand = Integer.parseInt(commandLine.getOptionValue("l"));
        rightOperand = Integer.parseInt(commandLine.getOptionValue("r"));
        String s = commandLine.getOptionValue("o");
        if (s.equals("+")) {
            operation = new Addition();
        } else if (s.equals("-")) {
            operation = new Subtraction();
        } else if (s.equals("*")) {
            operation = new Multiplication();
        } else if (s.equals("/")) {
            operation = new Division();
        } else {
            throw new Exception("false operation");
        }
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public Operation getOperation() {
        return operation;
    }
}
