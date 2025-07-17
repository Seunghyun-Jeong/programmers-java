package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char char1 = s1.charAt(n);
                char char2 = s2.charAt(n);

                if (char1 == char2) {
                    return s1.compareTo(s2);
                } else {
                    return Character.compare(char1, char2);
                }
            }
        });

        return strings;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] strings1 = {"sun", "bed", "car"};
        int n1 = 1;
        String[] result1 = sol.solution(strings1, n1);
        System.out.println(Arrays.toString(result1));

        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;
        String[] result2 = sol.solution(strings2, n2);
        System.out.println(Arrays.toString(result2));
    }
}