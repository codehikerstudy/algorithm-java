package MrKeeplearning.programmers.lv0.algo181943;

class Solution3 {
    public String solution(String my_string, String overwrite_string, int s) {
        String head = my_string.substring(0, s);
        String tail = my_string.substring(s + overwrite_string.length());
        return head + overwrite_string + tail;
    }
}
