package MrKeeplearning.programmers.lv0.algo181940;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution6 {
    public String solution(String my_string, int k) {
        String answer = Stream.generate(() -> my_string).limit(k).collect(Collectors.joining());
        return answer;
    }
}