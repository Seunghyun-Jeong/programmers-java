package org.example;

public class Solution {
    public int solution(int a, int b, int n) {
        int totalCola = 0;

        while (n >= a) {
            int newCola = (n / a) * b;
            totalCola += newCola;
            n = (n % a) + newCola;
        }

        return totalCola;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int a1 = 2, b1 = 1, n1 = 20;
        int result1 = sol.solution(a1, b1, n1);
        System.out.println(result1);

        int a2 = 3, b2 = 1, n2 = 20;
        int result2 = sol.solution(a2, b2, n2);
        System.out.println(result2);
    }
}