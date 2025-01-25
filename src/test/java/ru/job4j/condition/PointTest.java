package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double expected = 2.82;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double expected = 5.65;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints1dot1And2dot2And3dot3And4dot4Then3dot11() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double expected = 2.82;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus4dot4And3dot3And3dot3AndMinus1dot1Then7dot93() {
        Point a = new Point(-4, 3);
        Point b = new Point(2, -1);
        double expected = 7.21;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when200To000Then2() {
        double expected = 2;
        Point a3d = new Point(2, 0, 0);
        Point b3d = new Point(0, 0, 0);
        double out = a3d.distance3d(b3d);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void when100To110Then1() {
        double expected = 1;
        Point a3d = new Point(1, 0, 0);
        Point b3d = new Point(1, 1, 0);
        double out = a3d.distance3d(b3d);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void when220To222Then2() {
        double expected = 2;
        Point a3d = new Point(2, 2, 0);
        Point b3d = new Point(2, 2, 2);
        double out = a3d.distance3d(b3d);
        assertThat(out).isEqualTo(expected);
    }
}