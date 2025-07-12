package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sumSet = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> sortedList = new ArrayList<>(sumSet);
        Collections.sort(sortedList);

        int[] answer = new int[sortedList.size()];
        for (int i = 0; i < sortedList.size(); i++) {
            answer[i] = sortedList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] numbers1 = {2, 1, 3, 4, 1};
        int[] result1 = sol.solution(numbers1);
        System.out.println(Arrays.toString(result1));

        int[] numbers2 = {5, 0, 2, 7};
        int[] result2 = sol.solution(numbers2);
        System.out.println(Arrays.toString(result2));
    }
}