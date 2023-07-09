package MrKeeplearning.programmers.lv0.algo181943;

class Solution2 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        answer = sb.toString();
        return answer;
    }
}