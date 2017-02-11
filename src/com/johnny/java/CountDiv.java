package com.johnny.java;

/**
 * Created by Johnny on 2/11/2017.
 */
public class CountDiv {
    public static void main(String[] args) {
        CountDiv c = new CountDiv();
        System.out.println(c.solution(6, 11, 2));
    }

    public int solution(int A, int B, int K) {
        int halfA = 0;
        if (A > 1) {

            halfA = (A - 1) / K;
        }

        int halfB;
        halfB = B / K;

        int result = Math.abs(halfB - halfA);

        //If A == 0, we add one more divisor,
        //because, by definition, 0 is divisible by any number
        if (A == 0)
            result++;

        return result;
    }
}
