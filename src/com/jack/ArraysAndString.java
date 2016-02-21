package com.jack;

/**
 * Created by jack on 2016. 2. 11..
 */
public class ArraysAndString {
    public static void main(String[] args) {
        System.out.println("[#]" + isUniqueChars2("abcdea"));
    }

    public static boolean isUniqueChars2(String str) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            System.out.println("[#] val: " + val + ", char_set[val]: " + char_set[val]);

            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }
}
