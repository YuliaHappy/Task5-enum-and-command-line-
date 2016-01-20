package com.epam.javauniversity.commandline.perform;

import org.apache.commons.cli.ParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerformCommandLineTest {

    PerformCommandLine perform;

    @Before
    public void initialize() throws Exception {
        perform = new PerformCommandLine(new String[]{"-l","5","-r","4","-o","+"});
    }

    @Test
     public void getResultPerformTestTrue() throws Exception {
        Assert.assertEquals(9, perform.getResultPerform());
    }

    @Test
    public void getResultPerformTestFalse() throws Exception {
        Assert.assertNotEquals(6, perform.getResultPerform());
    }
}