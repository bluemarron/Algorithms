package com.season_2;

// Time Complexity : O(N^2)
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 6, 2, 1, 9, 8, 7};

        PrintHelper.print("insertion sort before", array);

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int aux = i - 1;

            while (aux >= 0 && array[aux] > temp) {
                array[aux + 1] = array[aux];
                aux--;
            }

            array[aux + 1] = temp;
        }

        PrintHelper.print("insertion sort after", array);
    }
}
