# 문자열 붙여서 출력하기

[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/181946)

## StringBuilder를 활용한 풀이

```java
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
```

```
테스트 1 〉	통과 (164.91ms, 64.6MB)
테스트 2 〉	통과 (148.83ms, 70.9MB)
테스트 3 〉	통과 (162.85ms, 64.1MB)
테스트 4 〉	통과 (174.57ms, 65.8MB)
```

## StringBuffer를 활용한 풀이

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        StringBuffer sb = new StringBuffer();
        if (a.length() <= 10 && b.length() <= 10) {
            sb.append(a).append(b);
            System.out.println(sb);
        } else {
            System.out.println("1이상 10이하의 길이만 가능합니다.");
        }
    }
}
```

```
테스트 1 〉	통과 (151.91ms, 62.3MB)
테스트 2 〉	통과 (156.62ms, 65.9MB)
테스트 3 〉	통과 (143.99ms, 70MB)
테스트 4 〉	통과 (148.78ms, 64MB)
```

## String의 덧셈 연산자

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.length() <= 10 && b.length() <= 10) {
            System.out.println(a+b);
        } else {
            System.out.println("1이상 10이하의 길이만 가능합니다.");
        }
    }
}
```

```
테스트 1 〉	통과 (153.01ms, 61.4MB)
테스트 2 〉	통과 (142.69ms, 71.8MB)
테스트 3 〉	통과 (155.88ms, 77MB)
테스트 4 〉	통과 (169.37ms, 66.9MB)
```
