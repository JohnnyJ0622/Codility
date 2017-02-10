package com.johnny.java;

import java.util.HashMap;

/**
 * Created by Johnny on 2/10/2017.
 */
public class FrogRiverOne {
    public static void main(String[] args) {
        int A[] = {1, 3, 1, 4, 2, 3, 5, 4};
        int x = 5;
        FrogRiverOne f = new FrogRiverOne();
        System.out.println(f.solution(x, A));

    }

    public int solution(int X, int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], 0);
            if (map.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
