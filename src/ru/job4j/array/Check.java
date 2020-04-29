package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for(int index = 0; index < data.length; index++) {
            if (data[0] == data[index]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] array = new boolean[] {true, true, true, true};
        boolean rsl = mono(array);
        System.out.println(rsl);
    }
}
