package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int number, int limit, int power) {
        List<Integer> count = new ArrayList<>();
        int result = 0;

        for (int i = 1; i <= number; i++) {
            int m = 0;

            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    m++;

                    if (j != i / j) {
                        m++;
                    }
                }
            }

            if (m > limit) {
                result += power;
            } else {
                result += m;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(5, 3, 2));

        System.out.println(sol.solution(10, 3, 2));
    }
}