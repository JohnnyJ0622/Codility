package com.johnny.java;

/**
 * Created by Johnny on 2/11/2017.
 */
public class PassingCars {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 1, 1};
        PassingCars p = new PassingCars();
        System.out.println(p.solutionE(a));
        System.out.println(p.solutionW(a));
    }

    public int solutionE(int A[]) {
        long e = 0;
        long passingCars = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                e++;
            } else {
                passingCars += e;
            }
        }
        return passingCars > 1000000000 ? -1 : (int) passingCars;
    }

    public int solutionW(int A[]) {
        long w = 0;
        long passingCars = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 1) {
                w++;
            } else {
                passingCars += w;
            }
        }
        return passingCars > 1000000000 ? -1 : (int) passingCars;
    }
}
