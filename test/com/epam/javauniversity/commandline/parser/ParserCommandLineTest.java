package com.epam.javauniversity.commandline.parser;

import com.epam.javauniversity.operation.Addition;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParserCommandLineTest {
    ParserCommandLine parserTrue;

    @Before
    public void initialize() throws Exception {
        parserTrue = new ParserCommandLine(new String[]{"-l","5","-r","4","-o","+"});
    }

    @Test
    public void parserCommandLineTestFalseOption() throws Exception {
        try {
            new ParserCommandLine(new String[]{"-f","5","-r","4","-o","+"});
            Assert.assertFalse(true);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void parserCommandLineTestFalseSize() throws Exception {
        try {
            new ParserCommandLine(new String[]{"-l", "2"});
            Assert.assertFalse(true);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void getLeftOperandTestTrue() throws Exception {
        Assert.assertEquals(5, parserTrue.getLeftOperand());
    }

    @Test
    public void getLeftOperandTestFalseValue() throws Exception {
        try {
            new ParserCommandLine(new String[]{"-l","t","-r","4","-o","+"});
            Assert.assertFalse(true);
        } catch (NumberFormatException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void getRightOperandTestTrue() throws Exception {
        Assert.assertEquals(4, parserTrue.getRightOperand());
    }

    @Test
    public void getRightOperandTestFalseValue() throws Exception {
        try {
            new ParserCommandLine(new String[]{"-l","5","-r","j","-o","+"});
            Assert.assertFalse(true);
        } catch (NumberFormatException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void getOperationTestTrue() throws Exception {
        Assert.assertTrue(parserTrue.getOperation().getClass() == new Addition().getClass());
    }

    @Test
    public void getOperationTestFalseValue() throws Exception {
        try {
            new ParserCommandLine(new String[]{"-l","5","-r","4","-o","6"});
            Assert.assertFalse(true);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
}