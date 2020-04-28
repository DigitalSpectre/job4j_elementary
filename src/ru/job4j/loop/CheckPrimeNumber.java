package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if(number == 1) {
            return false;
        }
        for(int index = 2; index <= number - 1; index++) {
            if(number % index == 0) {
                prime = false;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(CheckPrimeNumber.check(5));
        System.out.println(CheckPrimeNumber.check(4));
    }
}
