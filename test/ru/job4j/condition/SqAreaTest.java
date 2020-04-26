package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenpis4kis1then1() {
        int inP = 4;
        int inK = 1;
        double out = SqArea.square(inP, inK);
        double expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }
}