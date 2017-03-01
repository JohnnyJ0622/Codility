package com.johnny.java;

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
}
