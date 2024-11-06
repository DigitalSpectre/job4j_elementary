package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first,  second);
    }

    public static double subtractAndDiv(double first, double second) {
        return subtract(first, second) + div(first, second);
    }

    public static double allFunctionAdds(double first, double second) {
        return sum(first, second) + multiply(first, second) + div(first, second) + subtract(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен: " + subtractAndDiv(10, 20));
        System.out.println("Результат расчёта равен: " + allFunctionAdds(10, 20));
    }
}
