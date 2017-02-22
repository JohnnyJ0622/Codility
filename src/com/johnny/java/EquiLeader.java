package com.johnny.java;

/**
 * Created by Johnny on 2/17/2017.
 */
public class EquiLeader {
    public static void main(String[] args) {
        int[] a = {0, 0, 0, 1, 1, 1, 1};
        EquiLeader e = new EquiLeader();
        System.out.println(e.solution(a));
    }

    public int solution(int[] A) {
        int pos = 0;
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[pos] == A[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    pos = i;
                    count++;
                }
            }
        }

        int ret = 0;
        int cand = A[pos];

        int[] E = new int[A.length];
        int[] N = new int[A.length];

        int ec = 0;
        int nc = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == cand) {
                ec++;
            } else {
                nc++;
            }
            E[i] = ec;
            N[i] = nc;
        }

        for (int i = 0; i < A.length; i++) {
            if (E[i] > N[i] && ((nc - N[i]) < (ec - E[i]))) {
                ret++;
            }
        }

        return ret;
    }

}
