package MrKeeplearning.programmers.lv0.algo181945;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {

    public static List<Character> stringToCharList(String str) {
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<Character> chars = stringToCharList(str);
        for (char ch : chars) {
            System.out.println(ch);
        }
    }
}
