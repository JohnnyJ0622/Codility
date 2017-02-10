package com.johnny.java;

/**
 * Created by Johnny on 2/9/2017.
 */
public class CyclicRotation {

    public static void main(String args[]) {
        int[] A = {5, -1000};
        int K = 3;
        CyclicRotation c = new CyclicRotation();
        int[] show = c.solutionB(A, K);
        for (int i = 0; i < show.length; i++) {
            System.out.print(show[i] + " ");
        }
    }

    public int[] solutionA(int[] A, int K) {
        if (A.length <= 1) {
            return A;
        }

        if (K == 0) {
            return A;
        }

        K = K % A.length;

        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[(i + K) % A.length] = A[i];
        }
        return B;
    }

    public int[] solutionB(int[] A, int K) {

        if (A == null)
            return A;

        int n = A.length;
        if (n == 0 || n == 1)
            return A;

        K = K % A.length;
        if (K == 0)
            return A;

        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            int poz = (i + K) % n;
            B[poz] = A[i];
        }

        return B;
    }
}
