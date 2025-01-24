package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1And2And7Then7() {
        int result = Max.max(1, 2, 7);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1And9And3And5Then9() {
        int result = Max.max(1, 9, 3, 5);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}