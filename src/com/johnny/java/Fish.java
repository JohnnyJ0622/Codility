package com.johnny.java;

import java.util.Stack;

/**
 * Created by Johnny on 2/16/2017.
 */
public class Fish {
    public static void main(String[] args) {
//        int[] a = {4, 3, 2, 1, 5, 9, 8, 11, 10, 6, 7};
//        int[] b = {1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0};
        int[] a = {4, 3, 2, 1, 5};
        int[] b = {0, 1, 0, 0, 0};

        Fish f = new Fish();
        System.out.println(f.solution(a, b));
        System.out.println(f.solutionB(a, b));
    }

    public int solution(int[] A, int[] B) {
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            int[] temp = new int[2];
            temp[0] = A[i];
            temp[1] = B[i];
            if (stack.isEmpty()) {
                stack.push(temp);
                continue;
            }
            if (B[i] == 1) {
                stack.push(temp);

            } else if (stack.peek()[1] != B[i]) {
                while (!stack.isEmpty() &&
                        stack.peek()[0] < A[i] &&
                        stack.peek()[1] != B[i]) {
                    stack.pop();
                }
                if (!stack.isEmpty()
                        && stack.peek()[0] > A[i]
                        && stack.peek()[1] != B[i]) {
                    continue;
                } else {
                    stack.push(temp);
                }
            } else if (stack.peek()[1] == B[i]) {
                stack.push(temp);
            }
        }
        return stack.size();
    }


    public int solutionB(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 1) {
                stack.push(A[i]);
            } else {
                count++;
                while (stack.size() > 0) {
                    int item = stack.pop();
                    if (A[i] < item) {
                        stack.push(item);
                        count--;
                        break;
                    }
                }
            }
        }
        return count + stack.size();
    }
}
