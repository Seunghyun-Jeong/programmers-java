package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> score = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }

        List<Integer> result = new ArrayList<>();

        for (String[] p : photo) {
            int totalScore = 0;

            for (String person : p) {
                if (score.containsKey(person)) {
                    totalScore += score.get(person);
                }
            }

            result.add(totalScore);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] name1 = {"may", "kein", "kain", "radi"};
        int[] yearning1 = {5, 10, 1, 3};
        String[][] photo1 = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };
        System.out.println(sol.solution(name1, yearning1, photo1));

        String[] name2 = {"kali", "mari", "don"};
        int[] yearning2 = {11, 1, 55};
        String[][] photo2 = {
                {"kali", "mari", "don"},
                {"pony", "tom", "teddy"},
                {"con", "mona", "don"}
        };
        System.out.println(sol.solution(name2, yearning2, photo2));

        String[] name3 = {"may", "kein", "kain", "radi"};
        int[] yearning3 = {5, 10, 1, 3};
        String[][] photo3 = {
                {"may"},
                {"kein", "deny", "may"},
                {"kon", "coni"}
        };
        System.out.println(sol.solution(name3, yearning3, photo3));
    }
}