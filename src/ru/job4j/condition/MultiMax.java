package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third){
        int result = first;
        result = first >= second ? first : second;
        result = result >= third ? result : third;
        return result;
    }
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println(MultiMax.max(x, y, z));
    }
}
