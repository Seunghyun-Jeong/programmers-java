package org.example;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            if (hallOfFame.size() < k) {
                hallOfFame.add(score[i]);
            } else {
                if (score[i] > hallOfFame.peek()) {
                    hallOfFame.poll();
                    hallOfFame.add(score[i]);
                }
            }

            answer[i] = hallOfFame.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int k1 = 3;
        int[] score1 = {10, 100, 20, 150, 1, 100, 200};
        int[] result1 = sol.solution(k1, score1);
        System.out.println(Arrays.toString(result1));

        int k2 = 4;
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] result2 = sol.solution(k2, score2);
        System.out.println(Arrays.toString(result2));
    }
}