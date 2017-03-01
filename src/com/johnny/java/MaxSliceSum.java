package com.johnny.java;

import java.util.Arrays;

/**
 * Created by Johnny on 3/1/2017.
 */
public class MaxSliceSum {
    public static void main(String[] args) {
        int[] a = {3, 2, -6, 4, 0};
        MaxSliceSum m = new MaxSliceSum();
        System.out.println(m.solution(a));

    }

    public int solution(int[] A) {
        double meh = -2147483648;
        double msf = -2147483648;
        for (int i : A) {
            meh = Math.max(i, meh + i);
            msf = Math.max(msf, meh);
        }
        return (int) msf;
    }

    public int solutionB(int[] A) {
        int[] K = new int[A.length];
        K[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            int s = Math.max(K[i - 1], 0) + A[i];
            K[i] = s;
        }
        Arrays.sort(K);
        return K[K.length - 1];
    }
}
