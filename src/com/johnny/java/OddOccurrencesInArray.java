package com.johnny.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Johnny on 2/9/2017.
 */
public class OddOccurrencesInArray {
    public static void main(String args[]) {
        int[] a = {9, 3, 9, 3, 9, 7, 9, 7, 1, 2, 3, 4, 5, 6, 3, 2, 4, 1, 5, 6, 10};
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        System.out.println(o.solution(a));
        System.out.println(o.solutionB(a));
    }

    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i += 2) {
            if (A[i] != A[i + 1]) {
                return A[i];
            }
        }
        return A[A.length - 1];
    }

    public int solutionB(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i :
                A) {
            if (set.contains(i))
                set.remove(i);
            else
                set.add(i);
        }
        return set.iterator().next();
    }

}
