package org.example;

public class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n, 3);

        StringBuilder reversedTernary = new StringBuilder(ternary).reverse();

        int answer = Integer.parseInt(reversedTernary.toString(), 3);

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 45;
        int result1 = sol.solution(n1);
        System.out.println(result1);

        int n2 = 125;
        int result2 = sol.solution(n2);
        System.out.println(result2);

    }
}