package org.example;

public class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];

            int currentMax = Math.max(w, h);
            int currentMin = Math.min(w, h);

            maxWidth = Math.max(maxWidth, currentMax);
            maxHeight = Math.max(maxHeight, currentMin);
        }

        return maxWidth * maxHeight;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int result1 = sol.solution(sizes1);
        System.out.println(result1);

        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int result2 = sol.solution(sizes2);
        System.out.println(result2);

        // 테스트 케이스 3: 문제 예시
        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        int result3 = sol.solution(sizes3);
        System.out.println(result3);

    }
}