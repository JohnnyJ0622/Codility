package com.johnny.java;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Johnny on 2/12/2017.
 */
public class Distinct {
    public static void main(String[] args) {
        int[] a = {-3, -1, -1, 1, 4, 6};
        Distinct d = new Distinct();
        System.out.println(d.solution(a));

    }

    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i :
                A) {
            set.add(i);
        }
        return set.size();
    }

    public int solutionB(int[] A) {
        int result = 1;
        Arrays.sort(A);
        int l = A.length;
        if (l == 1) {
            return result;
        }
        if (l == 0) {
            return 0;
        }
        for (int i = 0; i < l - 1; i++) {
            if (A[i] != A[i + 1]) {
                result++;
            }
        }
        return result;
    }


}
