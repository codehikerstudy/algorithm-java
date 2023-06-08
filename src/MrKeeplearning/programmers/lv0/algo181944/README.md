# 홀짝 구분하기

[문제 바로 가기](https://school.programmers.co.kr/learn/courses/30/lessons/181944)

## Solution1

```java
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
```

```
테스트 1 〉	통과 (168.57ms, 72.4MB)
테스트 2 〉	통과 (156.16ms, 63.5MB)
테스트 3 〉	통과 (134.38ms, 70.3MB)
테스트 4 〉	통과 (150.67ms, 69MB)
```

## Solution2

```java
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
```

```
테스트 1 〉	통과 (187.16ms, 66.9MB)
테스트 2 〉	통과 (243.88ms, 73MB)
테스트 3 〉	통과 (179.91ms, 68MB)
테스트 4 〉	통과 (197.04ms, 67.1MB)
```