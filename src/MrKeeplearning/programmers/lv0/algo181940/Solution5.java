package MrKeeplearning.programmers.lv0.algo181940;

import java.util.Collections;

class Solution5 {
    public String solution(String my_string, int k) {
        String answer = String.join("", Collections.nCopies(k, my_string));
        return answer;
    }
}