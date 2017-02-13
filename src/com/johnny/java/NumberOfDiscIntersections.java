package com.johnny.java;

import java.util.Arrays;

/**
 * Created by Johnny on 2/13/2017.
 */
public class NumberOfDiscIntersections {
    public static void main(String[] args) {
        int[] a = {1, 2147483647, 0};
        NumberOfDiscIntersections n = new NumberOfDiscIntersections();
        System.out.println(n.solution(a));
        System.out.println(n.solutionB(a));
    }

    public int solution(int[] A) {
        int result = 0;
        int j = 0;
        long[] upper = new long[A.length];
        long[] lower = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            lower[i] = (long) i - A[i];
            upper[i] = (long) i + A[i];
        }

        Arrays.sort(lower);
        Arrays.sort(upper);

        for (int i = 0; i < A.length; i++) {
            while (j < A.length && upper[i] >= lower[j]) {
                result += j - i;
                j++;
            }
            if (result > 10000000) return -1;
        }

        return result;
    }

    //O(N*N) Low Performance.
    public int solutionB(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int k = i + 1; k < A.length; k++) {
                if (i + (long) A[i] >= k) {
                    result = result + 1;
                } else if (i + (long) A[i] >= k - (long) A[k]) {
                    result++;
                }
            }
        }
        return result;
    }
}
