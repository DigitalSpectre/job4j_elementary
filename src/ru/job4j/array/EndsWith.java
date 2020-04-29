package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for(int index = word.length - post.length, index2 = 0; index < word.length; index++, index2++) {
            result = word[index] == post[index2]? true: false;
        }
        return result;
    }
    public static void main(String[] args) {
        char[] word = new char[] {'A', 'B', 'C', 'D', 'E'};
        char[] post = new char[] {'D', 'E'};
        boolean rsl = endsWith(word, post);
        System.out.println(rsl);
    }
}