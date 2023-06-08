package MrKeeplearning.programmers.lv0.algo181940;

class Solution3 {
    public String solution(String my_string, int k) {
        // 고정된 길이의 array를 생성
        String[] strings = new String[k];
        for (int i = 0; i < k; i++) {
            strings[i] = my_string;
        }
        String stringArray = convertStringArrayToString(strings);
        return stringArray;
    }

    private static String convertStringArrayToString(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s);
        }
        return sb.toString();
    }
}