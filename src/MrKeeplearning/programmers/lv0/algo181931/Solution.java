package MrKeeplearning.programmers.lv0.algo181931;

public class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                answer += a + i * d;
            }
        }
        return answer;
    }
}