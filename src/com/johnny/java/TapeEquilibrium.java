package com.johnny.java;

import java.util.stream.IntStream;

/**
 * Created by Johnny on 2/10/2017.
 */
public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] A = {3};
        TapeEquilibrium t = new TapeEquilibrium();
        System.out.println(t.solution(A));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length <2){
            return A[0];
        }
        int result = 100000;
        for (int i = 1; i < A.length; i++) {
            int[] b = new int[i];
            System.arraycopy(A, 0, b, 0,i);
            int sum1 = IntStream.of(b).sum();
            int sum2 = IntStream.of(A).sum();
            int total = Math.abs(sum1*2 - sum2);
            System.out.println("i: " + i + " sum1: " + sum1
                    + " sum2: " + sum2 + " total: " + total);

            if (total < result) {
                result = total;
            }
        }
        return result;
    }
}
