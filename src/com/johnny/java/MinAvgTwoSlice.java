package com.johnny.java;

/**
 * Created by Johnny on 2/12/2017.
 */
public class MinAvgTwoSlice {
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 5, 1, 5, 8};
        MinAvgTwoSlice m = new MinAvgTwoSlice();
        System.out.println(m.solution(a));

    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        float min = 10000 * 3 + 1;
        for (int i = 0; i < A.length - 1; i++) {
            if ((A[i] + A[i + 1]) / 2f < min) {
                min = (A[i] + A[i + 1]) / 2f;
                result = i;
            }
        }
        for (int i = 0; i < A.length - 2; i++) {
            if ((A[i] + A[i + 1] + A[i + 2]) / 3f < min) {
                min = (A[i] + A[i + 1] + A[i + 2]) / 3f;
                result = i;
            }
        }
        return result;
    }
}
