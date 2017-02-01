package com.season_2;

// Time Complexity : O(N^2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 6, 2, 1, 9, 8, 7};

        PrintHelper.print("bubble sort before", array);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        PrintHelper.print("bubble sort after", array);
    }
}
