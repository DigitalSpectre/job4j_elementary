package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return max(third, max(left, right));
    }

    public static int max(int left, int right, int third, int fourth) {
        return max(fourth, (max(left, right, third)));
    }

    public static void main(String[] args) {
        int first = 15;
        int second = 7;
        System.out.println(Max.max(first, second));
    }
}
