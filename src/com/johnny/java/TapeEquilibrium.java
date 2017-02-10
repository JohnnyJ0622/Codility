package com.johnny.java;

import java.util.stream.IntStream;

/**
 * Created by Johnny on 2/10/2017.
 */
public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] A = {-1000, 1000};
        TapeEquilibrium t = new TapeEquilibrium();
        long startTime = System.currentTimeMillis();
        System.out.println(t.solutionB(A));
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length < 2) {
            return A[0];
        }
        int result = 100000;
        for (int i = 1; i < A.length; i++) {
            int[] b = new int[i];
            System.arraycopy(A, 0, b, 0, i);
            int sum1 = IntStream.of(b).sum();
            int sum2 = IntStream.of(A).sum();
            int total = Math.abs(sum1 * 2 - sum2);
            System.out.println("i: " + i + " sum1: " + sum1
                    + " sum2: " + sum2 + " total: " + total);

            if (total < result) {
                result = total;
            }
        }
        return result;
    }

    public int solutionB(int[] A) {
        // write your code in Java SE 8
        if (A.length < 2) {
            return A[0];
        }
        int result = 100001;
        int total = 0;
        int sum1 = 0;
        int sum2 = IntStream.of(A).sum();
        for (int i = 0; i < A.length - 1; i++) {
            sum1 = sum1 + A[i];
            total = Math.abs(sum1 * 2 - sum2);
            if (total < result) {
                result = total;
            }
        }
        return result;
    }

    public int solutionC(int[] A) {
        int N = A.length;

        int sum[] = new int[N];
        for (int i = 0; i < N; i++) {
            if (i == 0)
                sum[i] = A[i];
            else
                sum[i] = sum[i - 1] + A[i];
        }

        int min = 32000;
        for (int i = N - 1; i > 0; i--) {
            if (Math.abs(sum[i - 1] - (sum[N - 1] - sum[i - 1])) < min)
                min = Math.abs(sum[i - 1] - (sum[N - 1] - sum[i - 1]));
        }

        return min;
    }
}
