package com.season_2;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 6, 2, 1, 9, 8, 7};
        System.out.print("unsorted array => ");

        int i;
        for (i = 0; i < array.length; ++i) {
            System.out.print(array[i]);
        }

        for (i = 0; i < array.length - 1; ++i) {
            for (int j = 0; j < array.length - 1 - i; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("\r\nsorted array => ");

        for (i = 0; i < array.length; ++i) {
            System.out.print(array[i]);
        }

    }
}
