package org.example;

public class Solution {
    public String solution(int[] food) {
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                builder.append(i);
            }
        }

        String player1Food = builder.toString();
        String result = player1Food + "0";

        String player2Food = builder.reverse().toString();
        result += player2Food;

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] food1 = {1, 3, 4, 6};
        String result1 = sol.solution(food1);
        System.out.println(result1);

        int[] food2 = {1, 7, 1, 2};
        String result2 = sol.solution(food2);
        System.out.println(result2);
    }
}