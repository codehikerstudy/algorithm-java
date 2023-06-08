package MrKeeplearning.programmers.lv0.algo181947;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (1 <= a && 1 <= b && a <= 100 && b <= 100) {
            sb.append(a).append(" + ").append(b).append(" = ").append(a+b);
            System.out.println(sb);
        } else {
            System.out.println("Out of boundary.");
        }
    }
}