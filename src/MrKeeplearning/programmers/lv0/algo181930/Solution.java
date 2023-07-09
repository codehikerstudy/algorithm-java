package MrKeeplearning.programmers.lv0.algo181930;

import static java.lang.Math.pow;

public class Solution {
    public int solution(int a, int b, int c) {
        int answer;
        if (a == b && a == c) {
            answer = allSame(a, b, c);
        } else if (a != b && a != c && b != c) {
            answer = allDiff(a, b, c);
        } else {
            answer = diff(a, b, c);
        }
        return answer;
    }

    public int allDiff(int a, int b, int c) {
        return a + b + c;
    }

    public int diff(int a, int b, int c) {
        return allDiff(a, b, c) * (int)(pow(a, 2) + pow(b, 2) + pow(c, 2));
    }

    public int allSame(int a, int b, int c) {
        return diff(a, b, c) * (int)(pow(a, 3) + pow(b, 3) + pow(c, 3));
    }
}