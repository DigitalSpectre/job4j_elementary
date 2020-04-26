package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {
    @Test
    public void whenWomanWeight160then57point5kg() {
        double in = 160;
        double expected = 57.5;
        double out = Fit.womanWeight(in);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenManWeight180then92kg() {
        double in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);

        Assert.assertEquals(expected, out, 0.01);
    }
}