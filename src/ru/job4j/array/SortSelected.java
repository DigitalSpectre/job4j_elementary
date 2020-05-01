package ru.job4j.array;

import java.util.SortedMap;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length);
            data[index] = data[i];
            data[i] = min;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = new int[]{3, 5, 1, 2, 4};
        int[] rsl = sort(data);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
