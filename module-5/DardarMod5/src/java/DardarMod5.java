package com.example.dardarmod5;

public class DardarMod5 {

    public static int[] locateLargest(double[][] arrayParam) {
        int row = 0, col = 0;
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int row = 0, col = 0;
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int row = 0, col = 0;
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int row = 0, col = 0;
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static void main(String[] args) {
        int[][] test = {
                {3, 5, 1},
                {9, 2, 6}
        };

        int[] largest = locateLargest(test);
        int[] smallest = locateSmallest(test);

        System.out.println("Largest: row " + largest[0] + ", col " + largest[1]);
        System.out.println("Smallest: row " + smallest[0] + ", col " + smallest[1]);
    }
}
