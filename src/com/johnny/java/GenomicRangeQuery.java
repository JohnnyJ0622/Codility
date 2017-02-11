package com.johnny.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Johnny on 2/11/2017.
 */
public class GenomicRangeQuery {
    public static void main(String[] args) {
        String s = "CAGCCTA";
        int[] p = {2, 5, 0, 2};
        int[] q = {4, 5, 6, 2};
//        String s = "A";
//        int[] p = {0};
//        int[] q = {0};
        GenomicRangeQuery g = new GenomicRangeQuery();
        for (int i : g.solutionC(s, p, q)) {
            System.out.print(i + ", ");
        }
    }

    //the Best One
    public int[] solutionC(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int a = 0, c = 0, g = 0;
        int[] A = new int[S.length() + 1];
        int[] C = new int[S.length() + 1];
        int[] G = new int[S.length() + 1];
        StringBuilder sb = new StringBuilder();
        sb.append(S);
        StringBuilder sbs = new StringBuilder();

        for (int i = 1; i < sb.length() + 1; i++) {
            if (sb.substring(i - 1, i).equals("A")) {
                a++;
                A[i] = a;
                C[i] = c;
                G[i] = g;
            } else if (sb.substring(i - 1, i).equals("C")) {
                c++;
                A[i] = a;
                C[i] = c;
                G[i] = g;
            } else if (sb.substring(i - 1, i).equals("G")) {
                g++;
                A[i] = a;
                C[i] = c;
                G[i] = g;
            } else {
                A[i] = a;
                C[i] = c;
                G[i] = g;
            }
        }

        for (int i = 1; i < P.length + 1; i++) {
            if (A[Q[i - 1] + 1] > A[P[i - 1]]) {
                result[i - 1] = 1;
            } else if (C[Q[i - 1] + 1] > C[P[i - 1]]) {
                result[i - 1] = 2;
            } else if (G[Q[i - 1] + 1] > G[P[i - 1]]) {
                result[i - 1] = 3;
            } else {
                result[i - 1] = 4;
            }
        }
        return result;
    }

    public int[] solutionB(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int begin;
        int end;
        StringBuilder sb = new StringBuilder();
        sb.append(S);
        StringBuilder sbs = new StringBuilder();

        for (int i = 0; i < P.length; i++) {
            sbs.setLength(0);
            begin = P[i];
            end = Q[i] + 1;
            sbs.append(sb.substring(begin, end));
            if (sbs.indexOf("A") >= 0) {
                result[i] = 1;
            } else if (sbs.indexOf("C") >= 0) {
                result[i] = 2;
            } else if (sbs.indexOf("G") >= 0) {
                result[i] = 3;
            } else if (sbs.indexOf("T") >= 0) {
                result[i] = 4;
            }
        }
        return result;
    }


    //Performance is bad. O(N*M)
    public int[] solution(String S, int[] P, int[] Q) {
        ArrayList<String> list = new ArrayList<>();
        int[] result = new int[P.length];
        int begin;
        int end;
        for (int i = 0; i < P.length; i++) {
            begin = P[i];
            end = Q[i] + 1;
            list.add(S.substring(begin, end));
        }
        for (int i = 0; i < list.size(); i++) {
            char[] chars = list.get(i).toCharArray();
            Arrays.sort(chars);
            switch (chars[0]) {
                case 'A':
                    result[i] = 1;
                    break;
                case 'C':
                    result[i] = 2;
                    break;
                case 'G':
                    result[i] = 3;
                    break;
                case 'T':
                    result[i] = 4;
                    break;
            }
        }

        return result;
    }
}
