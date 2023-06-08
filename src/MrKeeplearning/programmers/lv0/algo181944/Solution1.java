package MrKeeplearning.programmers.lv0.algo181944;

import java.util.Scanner;

public class Solution1 {

    private static void evenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.printf("%d is even", n);
        } else {
            System.out.printf("%d is odd", n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 1000) {
            evenOrOdd(n);
        } else {
            System.out.println("Please check the constraints");
        }
    }
}