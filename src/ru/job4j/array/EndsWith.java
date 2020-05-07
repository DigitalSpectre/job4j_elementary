package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = word.length - post.length; index < word.length; index++) {
            System.out.println();
            result = word[index] == post[index - word.length + post.length];

            if (word[index] != post[index - word.length + post.length]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[]{'A', 'B', 'C', 'D', 'E'};
        char[] post = new char[]{'D', 'E'};
        boolean rsl = endsWith(word, post);
        System.out.println(rsl);
    }
}