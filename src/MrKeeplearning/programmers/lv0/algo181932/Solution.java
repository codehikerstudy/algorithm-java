package MrKeeplearning.programmers.lv0.algo181932;

public class Solution {
    public static String solution(String code) {
        int mode = 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            /**
             * mode가 0일 때를 1일 때로 변경했다.
             * mode가 1일 때를 -1일 때로 변경했다.
             * mode에 -1을 곱하는 방식을 선택해서 간편하게 mode를 바꿀 수 있도록 설정했다.
             */
            if (c == '1') {
                mode *= -1;
            }
            if (i == 0 && c != '1') {
                sb.append(c);
            } else if (mode == 1 && c != '1' && i % 2 == 0) {
                sb.append(c);
            } else if (mode == -1 && c != '1' && i % 2 != 0) {
                sb.append(c);
            }
        }
        String ret = sb.toString();
        if (ret.length() == 0) {
            return "EMPTY";
        } else {
            return ret;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
    }
}

