package org.example;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) {
                budget -= d[i];
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] d1 = {1, 3, 2, 5, 4};
        int budget1 = 9;
        int result1 = sol.solution(d1, budget1);
        System.out.println(result1);

        int[] d2 = {2, 2, 3, 3};
        int budget2 = 10;
        int result2 = sol.solution(d2, budget2);
        System.out.println(result2);
    }
}