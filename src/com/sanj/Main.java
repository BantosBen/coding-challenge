package com.sanj;

public class Main {

    public static void main(String[] args) {
        challenge1();
    }

    private static void challenge1() {
        int[] array = new int[]{8, 7, 2, 6, 3, 1};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == 10) {
                    System.out.println("Pair " + array[i] + " and " + array[j]);
                }
            }
        }
    }

    private static String challenge2() {
        int[][] matrix = new int[][]{{-1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int n = matrix.length;

        int declineSum = 0;
        int inclineSum = 0;

        int i = 0;
        for (int j = 0; j < n; j++) {
            declineSum += matrix[i][j];
            ++i;
        }

        i = 0;
        for (int j = n - 1; j >= 0; j--) {
            inclineSum += matrix[i][j];
            ++i;

        }


        int abs = Math.abs(inclineSum - declineSum);

        return "Absolete difference of diagonals " + abs;

    }
}
