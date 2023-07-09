package MrKeeplearning.programmers.lv0.algo181939;

class Solution {
    public static int solution(int a, int b) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        String str1 = sb1.append(a).append(b).toString();
        String str2 = sb2.append(b).append(a).toString();
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int result = Math.max(num1, num2);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(9, 91));
    }
}