package ru.job4j.converter;

/**
 * Converter.
 * Переводит рубли в евро и доллары.
 *
 * @author ALexander Kokovikhin
 */
public class Converter {
    /**
     * @param value - количество рублей
     * @return - возвращает значение в евро
     */
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * @param value - количество рублей
     * @return - возвращает значение в долларах
     */
    public static int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * @param args = args.
     */
    public static void main(String[] args) {
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