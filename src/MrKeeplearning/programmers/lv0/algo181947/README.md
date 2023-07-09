# 덧셈식 출력하기

[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/181947)

## String 덧셈 연산자를 사용한 경우

<p align="center">
    <img src="/src/MrKeeplearning/programmers/lv0/resources/덧셈식 출력하기 더하기 연산자.png">
</p>

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (1 <= a && 1 <= b && a <= 100 && b <= 100) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else {
            System.out.println("Out of boundary.");
        }
    }
}
```

## StringBuffer를 사용한 경우f

<p align="center">
    <img src="/src/MrKeeplearning/programmers/lv0/resources/덧셈식 출력하기 StringBuffer.png">
</p>

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        if (1 <= a && 1 <= b && a <= 100 && b <= 100) {
            sb.append(a).append(" + ").append(b).append(" = ").append(a+b);
            System.out.println(sb);
        } else {
            System.out.println("Out of boundary.");
        }
    }
}
```

## StringBuilder를 사용한 경우

<p align="center">
    <img src="/src/MrKeeplearning/programmers/lv0/resources/덧셈식 출력하기 StringBuilder.png">
</p>

```java
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
```
