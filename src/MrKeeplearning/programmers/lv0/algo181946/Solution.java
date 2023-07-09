package MrKeeplearning.programmers.lv0.algo181946;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        StringBuilder sb = new StringBuilder();
        if (a.length() <= 10 && b.length() <= 10) {
            sb.append(a).append(b);
            System.out.println(sb);
        } else {
            System.out.println("1이상 10이하의 길이만 가능합니다.");
        }
    }
}
