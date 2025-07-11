package org.example;

public class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sb.append(' ');
            } else if (Character.isUpperCase(ch)) {
                char newChar = (char) (((ch - 'A' + n) % 26) + 'A');
                sb.append(newChar);
            } else {
                char newChar = (char) (((ch - 'a' + n) % 26) + 'a');
                sb.append(newChar);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "AB";
        int n1 = 1;
        String result1 = sol.solution(s1, n1);
        System.out.println(result1);

        String s2 = "z";
        int n2 = 1;
        String result2 = sol.solution(s2, n2);
        System.out.println(result2);

        String s3 = "a B z";
        int n3 = 4;
        String result3 = sol.solution(s3, n3);
        System.out.println(result3);
    }
}