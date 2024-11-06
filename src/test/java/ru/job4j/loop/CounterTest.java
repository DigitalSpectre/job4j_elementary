package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CounterTest {
    @Test
    void whenStart2Finish7Then27() {
        int s = 2;
        int f = 7;
        int expected = 27;
        int output = Counter.sum(s, f);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart7Finish2Then0() {
        int s = 7;
        int f = 2;
        int expected = 0;
        int output = Counter.sum(s, f);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus3Finish7Then22() {
        int s = -3;
        int f = 7;
        int expected = 22;
        int output = Counter.sum(s, f);
        assertThat(output).isEqualTo(expected);
    }
}