package com.season_2;

// Time Complexity : O(N^2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 6, 2, 1, 9, 8, 7};

        PrintHelper.print("selection sort before", array);

        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[minIdx])
                    minIdx = j;

            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }

        PrintHelper.print("selection sort after", array);
    }
}
