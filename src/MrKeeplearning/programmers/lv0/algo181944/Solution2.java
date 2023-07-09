package MrKeeplearning.programmers.lv0.algo181944;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 1000) {
            System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
        } else {
            System.out.println("Please check the constraints");
        }
    }
}
