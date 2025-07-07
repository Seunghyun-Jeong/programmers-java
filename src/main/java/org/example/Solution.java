package org.example;

public class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int n = number.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] number1 = {-2, 3, 0, 2, -5};
        int result1 = sol.solution(number1);
        System.out.println(result1);

        int[] number2 = {-3, -2, -1, 0, 1, 2, 3};
        int result2 = sol.solution(number2);
        System.out.println(result2);

        int[] number3 = {-1, 1, -1, 1};
        int result3 = sol.solution(number3);
        System.out.println(result3);
    }
}