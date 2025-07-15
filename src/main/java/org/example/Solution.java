package org.example;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int c = 0; c < commands.length; c++) {
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];

            int[] tempArray = Arrays.copyOfRange(array, i - 1, j);

            Arrays.sort(tempArray);

            answer[c] = tempArray[k - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] array1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands1 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result1 = sol.solution(array1, commands1);
        System.out.println(Arrays.toString(result1));
    }
}