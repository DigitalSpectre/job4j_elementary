package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left;
        result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int first = 15;
        int second = 7;
        System.out.println(Max.max(first, second));
    }
}
