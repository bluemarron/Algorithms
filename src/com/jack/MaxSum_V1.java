package com.jack;

/**
 * Created by jack on 2016. 2. 22..
 */
// http://book.algospot.com/estimation.html
    
public class MaxSum_V1 {
    public static void main(String args[]) {
        int[] numbers = {-7, 4, -3, 6, 3, -8, 3, 4};
        int ret = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;

                for(int k = i; k <=j; k++) {
                    sum += numbers[k];
                    System.out.format("[#] i = %d, j = %d, k = %d => numbers[k] = %d, sum = %d \n", i, j, k, numbers[k], sum);
                }

                System.out.format("[##] ret = %d, sum = %d, max(ret, sum) = %d \n", ret, sum, Math.max(ret, sum));

                ret = Math.max(ret, sum);

                System.out.println("====================================");
            }

            System.out.println("====================================");
        }

        System.out.println("[#] max sum: " + ret);
    }

}
