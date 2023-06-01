package MrKeeplearning.programmers.lv0.algo181949;

import java.util.Scanner;

import static java.lang.Character.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        StringBuilder sb = new StringBuilder(str);
        StringBuffer sb = new StringBuffer(str);
        if (sb.length() != 0 && sb.length() <= 20) {
            for (int i = 0; i < sb.length(); i++) {
                if (isLowerCase(sb.charAt(i))) {
                    sb.setCharAt(i, toUpperCase(sb.charAt(i)));
                } else if (isUpperCase(sb.charAt(i))) {
                    sb.setCharAt(i, toLowerCase(sb.charAt(i)));
                }
            }
        }
        System.out.println(sb);
    }
}