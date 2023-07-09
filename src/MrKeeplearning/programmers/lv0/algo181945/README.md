# 문자열 돌리기

[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/181945)

## Solution1

```java
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
```

```
테스트 1 〉	통과 (125.43ms, 64.5MB)
테스트 2 〉	통과 (147.61ms, 69.7MB)
테스트 3 〉	통과 (133.65ms, 66.1MB)
```

## Solution2

```java
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (char ch : str.toCharArray()) {
            System.out.println(ch);
        }
    }
}
```

```
테스트 1 〉	통과 (132.60ms, 68.1MB)
테스트 2 〉	통과 (146.99ms, 71.3MB)
테스트 3 〉	통과 (138.03ms, 66.3MB)
```