package com.johnny.java;

import java.util.TreeSet;

/**
 * Created by Johnny on 2/10/2017.
 */
public class PermCheck {
    public static void main(String[] args) {
        int[] a = {3, 1};
        PermCheck p = new PermCheck();
        System.out.println(p.solution(a));
    }

    public int solution(int[] A) {
        int result = 1;
        int s = A.length;

        if (A.length == 1 && A[0] != 1) {
            return 0;
        }

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < s; i++) {
            set.add(A[i]);
        }

        while (set.contains(result)) {
            result++;
        }

        if (result > A.length) {
            return 1;
        } else {
            return 0;
        }

    }
}
