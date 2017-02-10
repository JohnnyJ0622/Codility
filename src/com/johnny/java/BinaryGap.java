package com.johnny.java;

/**
 * Created by Johnny on 2/9/2017.
 */
public class BinaryGap {
    public static void main(String args[]) {
        BinaryGap b = new BinaryGap();
        System.out.println(b.solution(9));
        System.out.println(b.solution(529));
        System.out.println(b.solution(20));
        System.out.println(b.solution(561892));
    }

    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        int max = 0;
        int count = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.substring(i, i + 1).equals("0")) {
                count++;
            } else {
                if (count > max) max = count;
                count = 0;
            }
        }
        return max;
    }
}
