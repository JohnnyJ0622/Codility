package com.johnny.java;

/**
 * Created by Johnny on 2/12/2017.
 */
public class Equi {
    public static void main(String[] args) {
        int[] a = {-1, 3, -4, 5, 1, -6, 2, 1};
        Equi d = new Equi();
        System.out.println(d.solution(a));
    }

    public int solution(int[] A) {
        // Default function result
        int equilibrium = -1;

        // Check arguments
        if (A == null) {
            return equilibrium;
        } else if (A.length == 0) {
            return equilibrium;
        } else {
            // Strategy: Consider the input array two separate sub-arrays, one to the
            // left of the element being considered, the other to the right. We step
            // through the array sequentially until the sums of the sub-arrays are equal.

            // Get initial left and right sums
            long sumLeft = 0;
            long sumRight = 0;
            for (int i = 0; i < A.length; i++) {
                sumRight += A[i];
            }

            // Traverse the array, looking for the first equilibrium
            for (int i = 0; i < A.length; i++) {
                long tempRight = sumRight - A[i];
                if (sumLeft == tempRight) {
                    // We have found a solution at the i-th element
                    equilibrium = i;
                    break;
                } else {
                    // Prepare for next comparison
                    sumLeft += A[i];
                    sumRight = tempRight;
                }
            }
        }

        // Return the result
        return equilibrium;
    }


/*
    Task description
This is a demo task.

A zero-indexed array A consisting of N integers is given. An equilibrium index of this array is any integer P such that 0 ≤ P < N and the sum of elements of lower indices is equal to the sum of elements of higher indices, i.e.
A[0] + A[1] + ... + A[P−1] = A[P+1] + ... + A[N−2] + A[N−1].
Sum of zero elements is assumed to be equal to 0. This can happen if P = 0 or if P = N−1.

For example, consider the following array A consisting of N = 8 elements:

  A[0] = -1
  A[1] =  3
  A[2] = -4
  A[3] =  5
  A[4] =  1
  A[5] = -6
  A[6] =  2
  A[7] =  1
P = 1 is an equilibrium index of this array, because:

A[0] = −1 = A[2] + A[3] + A[4] + A[5] + A[6] + A[7]
P = 3 is an equilibrium index of this array, because:

A[0] + A[1] + A[2] = −2 = A[4] + A[5] + A[6] + A[7]
P = 7 is also an equilibrium index, because:

A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] = 0
and there are no elements with indices greater than 7.

P = 8 is not an equilibrium index, because it does not fulfill the condition 0 ≤ P < N.

Write a function:

class Solution { public int solution(int[] A); }

that, given a zero-indexed array A consisting of N integers, returns any of its equilibrium indices. The function should return −1 if no equilibrium index exists.

For example, given array A shown above, the function may return 1, 3 or 7, as explained above.

Assume that:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
*/


}