package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        HashMap<Character, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (lastSeen.containsKey(currentChar)) {
                answer[i] = i - lastSeen.get(currentChar);
            } else {
                answer[i] = -1;
            }

            lastSeen.put(currentChar, i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "banana";
        int[] result1 = sol.solution(s1);
        System.out.println(Arrays.toString(result1));

        String s2 = "foobar";
        int[] result2 = sol.solution(s2);
        System.out.println(Arrays.toString(result2));
    }
}