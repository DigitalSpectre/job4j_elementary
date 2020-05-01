package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 1, -1, 9, 0, 1};
        System.out.println(MinDiapason.findMin(array, 2, 5));
    }
}
