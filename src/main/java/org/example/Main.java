package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = { {1, 2}, {2, 3} };
        int[][] arr2 = { {3, 4}, {5, 6} };
        int[][] arr3 = { {1}, {2} };
        int[][] arr4 = { {3}, {4} };
        int[][] result = solution.solution(arr1, arr2);
        int[][] result2 = solution.solution(arr3, arr4);
        System.out.println(Arrays.deepToString(result));
        System.out.println(Arrays.deepToString(result2));
    }
}