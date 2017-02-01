package com.season_2;

/**
 * Created by jack on 2017. 2. 1..
 */
public class PrintHelper {
    public static void print(String title, int[] array) {
        System.out.print("[#] " + title + " => ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        System.out.print("\r\n");
    }
}
