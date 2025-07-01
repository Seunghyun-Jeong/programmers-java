package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answerList = new ArrayList<>();

        if (arr.length > 0) {
            answerList.add(arr[0]);
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != answerList.get(answerList.size() - 1)) {
                answerList.add(arr[i]);
            }
        }

        return answerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] result1 = sol.solution(arr1);
        System.out.println(Arrays.toString(result1));

        int[] arr2 = {4, 4, 4, 3, 3};
        int[] result2 = sol.solution(arr2);
        System.out.println(Arrays.toString(result2));
    }
}
