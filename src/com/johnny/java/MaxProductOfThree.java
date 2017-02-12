package com.johnny.java;

import java.util.Arrays;

/**
 * Created by Johnny on 2/12/2017.
 */
public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] a = {-3, -1, -2, 0,1};
        MaxProductOfThree m = new MaxProductOfThree();
        System.out.println(m.solution(a));
    }

    public int solution(int[] A) {
        Arrays.sort(A);
        int length = A.length - 1;
        return Math.max(A[0] * A[1] * A[length], A[length] * A[length - 1] * A[length - 2]);
    }
}
