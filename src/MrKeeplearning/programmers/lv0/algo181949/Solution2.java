package MrKeeplearning.programmers.lv0.algo181949;

import java.util.Scanner;

import static java.lang.Character.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";

        for (Character c : str.toCharArray()) {
            if (isUpperCase(c)) {
                answer += toLowerCase(c);
            } else if (isLowerCase(c)) {
                answer += toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}
