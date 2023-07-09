package MrKeeplearning.programmers.lv0.algo181943;

class Solution1 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int overwriteStringLength = overwrite_string.length();
        if (overwriteStringLength <= my_string.length() && my_string.length() <= 1000) {
            String head = my_string.substring(0, s);
            int substringEndIndex = s + overwriteStringLength - 1;
            // overwrite_string가 끝나는 지점과 my_string이 끝나는 지점이 동일하면 추가로 string을 이어붙일 필요가 없지만
            // 만약 overwrite한 부분 이후로 추가로 문자열이 있다면 해당 부분까지 이어서 값을 반환해야 한다.
            if (substringEndIndex != my_string.length() - 1) {
                String tail = my_string.substring(substringEndIndex + 1);
                answer = head + overwrite_string + tail;
            } else {
                answer = head + overwrite_string;
            }
        } else {
            System.out.println("Please check the constraints");
        }
        return answer;
    }
}