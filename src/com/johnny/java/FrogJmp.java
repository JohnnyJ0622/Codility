package com.johnny.java;


/**
 * Created by Johnny on 2/10/2017.
 */
public class FrogJmp {
    public static void main(String[] args) {
        FrogJmp f = new FrogJmp();
        int X = 10;
        int Y = 70;
        int D = 30;
        System.out.println(f.solution(X, Y, D));
    }

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int count;
        if (X > Y) {
            return 0;
        }
        int YminusX = (Y - X);
        int middleNum = YminusX / D;

        if (middleNum * D - YminusX >= 0) {
            count = middleNum;
        } else {
            count = middleNum + 1;
        }

        return count;
    }
}
