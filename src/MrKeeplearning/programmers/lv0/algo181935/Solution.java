package MrKeeplearning.programmers.lv0.algo181935;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) {
            answer = evenSum(n);
        } else {
            answer = oddSum(n);
        }
        return answer;
    }

    private int evenSum(int n) {
        int i = 0;
        int sum = 0;
        while (i <= n) {
            sum += i*i;
            i += 2;
        }
        return sum;
    }

    private int oddSum(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}