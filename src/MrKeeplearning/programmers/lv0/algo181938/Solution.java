package MrKeeplearning.programmers.lv0.algo181938;

public class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int ab = Integer.parseInt(sb.append(a).append(b).toString());
        int two_ab = 2 * a * b;
        int answer = Math.max(ab, two_ab);
        return answer;
    }
}