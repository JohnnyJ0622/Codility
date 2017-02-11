package com.johnny.java;

/**
 * Created by Johnny on 2/10/2017.
 */
public class MaxCounters {
    public static void main(String[] args) {
        int[] a = {3, 4, 4, 6, 1, 4, 4};
        int n = 5;
        MaxCounters m = new MaxCounters();
        for (int r : m.solution(n, a)) {
            System.out.print(r + ", ");
        }
    }

    public int[] solution(int N, int[] A) {
        int max = 0;
        int temp = 0;
        int[] result = new int[N];
        for (int i : A) {

            if (i <= N) {
                if (result[i - 1] < temp) {
                    result[i - 1] = temp + 1;
                } else {
                    result[i - 1] = result[i - 1] + 1;
                }

                if (result[i - 1] > max) {
                    max++;
                }

            } else {
                temp = max;
            }
        }

        for (int i = 0; i < N; i++)
            if (temp > result[i]) result[i] = temp;

        return result;
    }
}
