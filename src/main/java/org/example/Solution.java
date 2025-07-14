package org.example;

public class Solution {
    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "one4seveneight";
        int result1 = sol.solution(s1);
        System.out.println(result1);

        String s2 = "23four5six7";
        int result2 = sol.solution(s2);
        System.out.println(result2);

        String s3 = "2three45sixseven";
        int result3 = sol.solution(s3);
        System.out.println(result3);

        String s4 = "123";
        int result4 = sol.solution(s4);
        System.out.println(result4);
    }
}