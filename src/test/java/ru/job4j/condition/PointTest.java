package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        double expected =  2.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        int x1 = -1, y1 = -1, x2 = 1, y2 = 1;
        double expected = 2.83;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        int x1 = -2, y1 = -2, x2 = 2, y2 = 2;
        double expected = 5.66;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints1dot1And2dot2And3dot3And4dot4Then3dot11() {
        double x1 = 1.1, y1 = 2.2, x2 = 3.3, y2 = 4.4;
        double expected = 3.11;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus4dot4And3dot3And3dot3AndMinus1dot1Then7dot93() {
        double x1 = -4.4, y1 = 3.3, x2 = 2.2, y2 = -1.1;
        double expected = 7.93;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
