package org.example;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0, j = 0;

        for (String word : goal) {
            if (i < cards1.length && cards1[i].equals(word)) {
                i++;
            } else if (j < cards2.length && cards2[j].equals(word)) {
                j++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(sol.solution(cards1, cards2, goal));

        String[] cards1_2 = {"i", "water", "drink"};
        String[] cards2_2 = {"want", "to"};
        String[] goal_2 = {"i", "want", "to", "drink", "water"};

        System.out.println(sol.solution(cards1_2, cards2_2, goal_2));
    }
}