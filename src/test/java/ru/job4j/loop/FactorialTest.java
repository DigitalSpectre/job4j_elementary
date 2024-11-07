package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void when0Then1() {
        int n = 0;
        int expected = 1;
        int output = Factorial.calculate(n);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when1Then1() {
        int n = 1;
        int expected = 1;
        int output = Factorial.calculate(n);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when3Then6() {
        int n = 3;
        int expected = 6;
        int output = Factorial.calculate(n);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when5Then120() {
        int n = 5;
        int expected = 120;
        int output = Factorial.calculate(n);
        assertThat(output).isEqualTo(expected);
    }
}