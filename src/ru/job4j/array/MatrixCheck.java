package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for(int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] array = new char[3][3];
        for(int i = 0; i < array.length; i++) {
            for(int j =0; j < array.length; j++) {
                array[i][j] = 'X';
            }
        }
        System.out.println(monoHorizontal(array, 1));
/*
        for(int i = 0; i < array.length; i++) {
            for(int j =0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
*/
    }
}
