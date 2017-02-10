package com.johnny.java;

import java.util.HashSet;

/**
 * Created by Johnny on 2/10/2017.
 */
public class MissingInteger {
    public static void main(String[] args) {
        int[] A = {4, 5, 6, 1, 2};
        MissingInteger m = new MissingInteger();
        System.out.println(m.solution(A));
    }

    public int solution(int[] A) {
        int result = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        while (set.contains(result)) {
            result++;
        }
        return result;
    }
}
