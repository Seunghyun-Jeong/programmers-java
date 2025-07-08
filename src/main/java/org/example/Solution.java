package org.example;

public class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1);

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder processedWord = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (j % 2 == 0) {
                    processedWord.append(Character.toUpperCase(ch));
                } else {
                    processedWord.append(Character.toLowerCase(ch));
                }
            }
            answer.append(processedWord);

            if (i < words.length - 1) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "try hello world";
        String result1 = sol.solution(s1);
        System.out.println(result1);
    }
}