package com.jack;

public class RotateArray_V1 {

    public static void main(String[] args) {
        char[] orgArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] rotatedArray = getRotatedArray(orgArray, 4);

        System.out.println("[#] orgArray: " + String.valueOf(orgArray));
        System.out.println("[#] rotatedArray: " + String.valueOf(rotatedArray));

    }

    private static char[] getRotatedArray(char[] orgArray, int order) {
        char[] rotatedArray = new char[orgArray.length];

        for (int i = 0; i < orgArray.length; i++) {
            int idx = (i + order) % orgArray.length;
            rotatedArray[idx] = orgArray[i];
        }

        return rotatedArray;
    }
}