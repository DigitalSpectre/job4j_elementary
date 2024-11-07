package ru.job4j.array;

public class ForEachUsage {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four", "five"};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}