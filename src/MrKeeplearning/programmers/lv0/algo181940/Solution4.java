package MrKeeplearning.programmers.lv0.algo181940;

import java.util.Arrays;

class Solution4 {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        String stringToApppend = my_string;
        String[] strings = new String[k];
        Arrays.fill(strings, stringToApppend);
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
}