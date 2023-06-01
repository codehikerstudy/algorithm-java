package MrKeeplearning.programmers.lv0.algo181950;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        // 방법1
//        while(n != 0) {
//            System.out.print(str);
//            n--;
//        }

        // 방법2
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++){
//            sb.append(str);
//        }
//        String s = sb.toString();
//        System.out.println(s);

        // 방법3 (가장 BEST)
//        System.out.println(str.repeat(n));

        // 방법4 (nCopies 메서드로 문자열 생성)
//        String newString = String.join("", Collections.nCopies(n, str));
//        System.out.println(newString);

        // 방법5 (자바 Stream의 generate 메서드를 활용)
        String newString = Stream.generate(() -> str).limit(n).collect(Collectors.joining());
        System.out.println(newString);
    }
}