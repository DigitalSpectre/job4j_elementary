package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for(int index = 0; index < pref.length; index++) {
            if (word[index] == pref[index]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[] {'A','B', 'C', 'D', 'E'};
        char[] pref = new char[] {'A','B', 'C'};
        boolean rsl = startsWith(pref, word);
        System.out.println(rsl);
    }
}
