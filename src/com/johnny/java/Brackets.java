package com.johnny.java;

import java.util.Stack;

/**
 * Created by Johnny on 2/13/2017.
 */
public class Brackets {
    public static void main(String[] args) {
        String s = "{([)]}";
        Brackets b = new Brackets();
        System.out.println(b.solution(s));
    }

    public int solution(String S) {
        int result = 0;
        if (S.length() % 2 != 0) {
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        for (char elem : S.toCharArray()) {
            switch (elem) {
                case ')':
                    checkAndPop(stack, '(');
                    break;
                case ']':
                    checkAndPop(stack, '[');
                    break;
                case '}':
                    checkAndPop(stack, '{');
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
