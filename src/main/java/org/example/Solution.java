package org.example;

import java.util.Arrays;

public class Solution {

    public int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = getGCD(n, m);
        answer[1] = (n / answer[0]) * m;

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 3;
        int m1 = 12;
        int[] result1 = sol.solution(n1, m1);
        System.out.println(Arrays.toString(result1));

        int n2 = 2;
        int m2 = 5;
        int[] result2 = sol.solution(n2, m2);
        System.out.println(Arrays.toString(result2));
    }
}
