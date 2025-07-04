package org.example;

public class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();

        long pValue = Long.parseLong(p);

        for (int i = 0; i <= t.length() - pLength; i++) {
            String subStr = t.substring(i, i + pLength);
            long subStrValue = Long.parseLong(subStr);

            if (subStrValue <= pValue) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String t1 = "3141592";
        String p1 = "271";
        int result1 = sol.solution(t1, p1);
        System.out.println(result1);

        String t2 = "500220839878";
        String p2 = "7";
        int result2 = sol.solution(t2, p2);
        System.out.println(result2);

        String t3 = "10203";
        String p3 = "15";
        int result3 = sol.solution(t3, p3);
        System.out.println(result3);
    }
}