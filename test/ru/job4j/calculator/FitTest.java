package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {
    @Test
    public void womanWeight() {
        double in = 160;
        double expected = 57.5;
        double out = Fit.womanWeight(in);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void manWeight1() {
        double in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);

        Assert.assertEquals(expected, out, 0.01);
    }
}

/*
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
 */