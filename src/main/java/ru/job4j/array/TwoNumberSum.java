package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] dataError = new int[] {};
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] == target) {
                int[] data = new int[2];
                data[0] = left;
                data[1] = right;
                return data;
            } else if (array[left] + array[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return dataError;
    }

    public static void main(String[] args) {
        int[] data = new int[] {5, 7};
        getIndexes(data, 0);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}