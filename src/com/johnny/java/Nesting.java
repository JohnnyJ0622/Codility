package com.johnny.java;

import java.util.Stack;

/**
 * Created by Johnny on 2/17/2017.
 */
public class Nesting {
    public static void main(String[] args) {
        String s = "(()(())())";
        Nesting n = new Nesting();
        System.out.println(n.solution(s));
    }

    public int solution(String S) {
        if (S.length() % 2 != 0) {
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        for (char elem : S.toCharArray()) {
            switch (elem) {
                case ')':
                    checkAndPop(stack, '(');
                    break;
                default:
                    stack.push(elem);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    private void checkAndPop(Stack<Character> stack, char c) {
        if (!stack.isEmpty() && stack.peek() == c) {
            stack.pop();
        }
    }
}