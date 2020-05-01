package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        // если элемента нет, то возвращаем -1;
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет, то возвращаем -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5};
        int el = 3;
        System.out.println(FindLoop.indexOf(data, el));

        int[] data1 = new int[]{1, 2, 3, 4, 5};
        int el1 = 4;
        System.out.println(FindLoop.indexOf(data1, el1, 2, 4));
    }
}
