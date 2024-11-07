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

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus3To17Then17() {
        int start = -3;
        int finish = 17;
        int result = Counter.sumByEven(start, finish);
        int expected = 70;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus17ToMinus1ThenMinus72() {
        int start = -17;
        int finish = -1;
        int result = Counter.sumByEven(start, finish);
        int expected = -72;
        assertThat(result).isEqualTo(expected);
    }
}