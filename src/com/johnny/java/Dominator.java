package com.johnny.java;

import java.util.Stack;

/**
 * Created by Johnny on 2/17/2017.
 */
public class Dominator {
    public static void main(String[] args) {
        int[] a = {2, 1, 1, 3, 4};
        Dominator d = new Dominator();
        System.out.println(d.solution(a));
    }

    public int solution(int[] A) {
        int result = -1;
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            int[] temp = new int[2];
            temp[0] = A[i];
            temp[1] = i;
            if (stack.isEmpty()) {
                stack.push(temp);
                continue;
            }
            if (!stack.isEmpty() && stack.peek()[0] != A[i]) {
                stack.pop();
            } else {
                stack.push(temp);
            }
        }

        if (stack.isEmpty()) {
            return -1;
        }

        int count = 0;
        for (int x :
                A) {
            if (x == stack.peek()[0]) {
                count += 1;
            }
        }

        if (count > A.length / 2) {
            result = stack.peek()[1];
        }

        return result;
    }
}

