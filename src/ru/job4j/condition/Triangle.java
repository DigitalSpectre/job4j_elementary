package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
        System.out.println(Triangle.exist(a, b, c));
    }
}
