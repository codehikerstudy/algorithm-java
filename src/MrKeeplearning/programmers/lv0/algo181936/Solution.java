package MrKeeplearning.programmers.lv0.algo181936;

class Solution {
    public int solution(int number, int n, int m) {
        int answer = (number % n == 0 && number % m == 0) ? 1 : 0;
        return answer;
    }
}