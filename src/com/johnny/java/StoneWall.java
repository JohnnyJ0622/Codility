package com.johnny.java;

import java.util.Stack;

/**
 * Created by Johnny on 2/15/2017.
 */
public class StoneWall {
    public static void main(String[] args) {
        int[] h = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        StoneWall s = new StoneWall();
        System.out.println(s.solution(h));
    }

    public int solution(int[] H) {
        int cuts = 0;
        Stack<Integer> st = new Stack<>();

        for (int h : H) {
            while (!st.isEmpty() && st.peek() > h) {
                st.pop();
            }
            if (st.isEmpty() || st.peek() < h) {
                st.push(h);
                cuts++;
            }
        }

        return cuts;
    }
}
