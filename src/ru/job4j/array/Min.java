package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for(int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[] {4, 3, 1, 8, 9, 0, -1};
        System.out.println(Min.findMin(array));
    }
}
