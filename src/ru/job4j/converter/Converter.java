package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value){
        return value / 70;
    }
    public static int rubleToDollar(int value){
        return value / 60;
    }
    public static void main(String[] args){
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int inD = 120;
        int expectedD = 2;
        int outD = rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("120 rubles are 2. Test result : " + passedD);
    }
}