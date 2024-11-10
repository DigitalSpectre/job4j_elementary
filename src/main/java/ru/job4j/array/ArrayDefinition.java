package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Doe";
        names[3] = "Bob";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        System.out.println("ages: " + ages.length);
        System.out.println("surnames: " + surnames.length);
        System.out.println("prices: " + prices.length);
    }
}
