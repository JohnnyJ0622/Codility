package com.johnny.java;

import java.util.Arrays;

/**
 * Created by Johnny on 2/12/2017.
 */
public class Triangle {
    public static void main(String[] args) {
        int[] a = {2147483647, 2147483647, 2147483647};
        Triangle t = new Triangle();
        System.out.println(t.solution(a));
    }

    public int solution(int[] A) {
        Arrays.sort(A);
        int l = A.length - 1;
        if (l < 2) {
            return 0;
        }
        //handle the problem of Integer overflow.
        long x, y, z;
        for (int i = l; i > 1; i--) {
            x = A[i];
            y = A[i - 1];
            z = A[i - 2];
            if (x < y + z) {
                return 1;
            }
        }
//        for (int i = l; i > 1; i--) {
//            if (A[i] < A[i - 1] + A[i - 2]) {
//                return 1;
//            }
//        }
        return 0;
    }
}
