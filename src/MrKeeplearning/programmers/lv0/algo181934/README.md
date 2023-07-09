# 조건 문자열

[문제 바로 가기](https://school.programmers.co.kr/learn/courses/30/lessons/181934)

## Solution1

```java
public class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (ineq.equals(">") && eq.equals("=")) {
            answer = n >= m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            answer = n <= m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            answer = n > m ? 1 : 0;
        } else {
            answer = n < m ? 1 : 0;
        }
        return answer;
    }
}
```

```
테스트 1 〉	통과 (0.02ms, 75.9MB)
테스트 2 〉	통과 (0.03ms, 83.1MB)
테스트 3 〉	통과 (0.02ms, 77MB)
테스트 4 〉	통과 (0.02ms, 72.3MB)
테스트 5 〉	통과 (0.03ms, 80.9MB)
테스트 6 〉	통과 (0.03ms, 71MB)
테스트 7 〉	통과 (0.02ms, 74.7MB)
테스트 8 〉	통과 (0.02ms, 77.8MB)
테스트 9 〉	통과 (0.03ms, 74.1MB)
테스트 10 〉	통과 (0.03ms, 78MB)
테스트 11 〉	통과 (0.02ms, 72.2MB)
테스트 12 〉	통과 (0.02ms, 72.1MB)
테스트 13 〉	통과 (0.03ms, 77.2MB)
테스트 14 〉	통과 (0.03ms, 76.1MB)
테스트 15 〉	통과 (0.04ms, 78.6MB)
테스트 16 〉	통과 (0.03ms, 73.8MB)
테스트 17 〉	통과 (0.03ms, 67.2MB)
테스트 18 〉	통과 (0.02ms, 77.3MB)
테스트 19 〉	통과 (0.03ms, 74.3MB)
테스트 20 〉	통과 (0.03ms, 75.8MB)
테스트 21 〉	통과 (0.02ms, 75.2MB)
테스트 22 〉	통과 (0.04ms, 78.7MB)
테스트 23 〉	통과 (0.04ms, 72.8MB)
테스트 24 〉	통과 (0.03ms, 71.1MB)
테스트 25 〉	통과 (0.04ms, 73.7MB)
테스트 26 〉	통과 (0.03ms, 69.9MB)
테스트 27 〉	통과 (0.02ms, 78MB)
테스트 28 〉	통과 (0.03ms, 71.2MB)
테스트 29 〉	통과 (0.03ms, 73.7MB)
테스트 30 〉	통과 (0.02ms, 76.6MB)
```

## Solution2

Map과 BiFunction 활용

```java
import java.util.Map;
import java.util.function.BiFunction;

public class Solution2 {
    public int solution(String ineq, String eq, int n, int m) {
        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );

        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
    }
}
```

```
테스트 1 〉	통과 (2.25ms, 74MB)
테스트 2 〉	통과 (5.04ms, 76.6MB)
테스트 3 〉	통과 (2.82ms, 82.9MB)
테스트 4 〉	통과 (3.52ms, 75.4MB)
테스트 5 〉	통과 (3.03ms, 73.9MB)
테스트 6 〉	통과 (7.39ms, 78.8MB)
테스트 7 〉	통과 (3.17ms, 73.8MB)
테스트 8 〉	통과 (2.95ms, 75.2MB)
테스트 9 〉	통과 (2.61ms, 73MB)
테스트 10 〉	통과 (2.71ms, 76.2MB)
테스트 11 〉	통과 (1.96ms, 78.8MB)
테스트 12 〉	통과 (2.06ms, 84.5MB)
테스트 13 〉	통과 (3.17ms, 90.2MB)
테스트 14 〉	통과 (2.23ms, 77.9MB)
테스트 15 〉	통과 (2.47ms, 78.7MB)
테스트 16 〉	통과 (2.64ms, 73.7MB)
테스트 17 〉	통과 (2.42ms, 75.3MB)
테스트 18 〉	통과 (2.07ms, 78.5MB)
테스트 19 〉	통과 (3.62ms, 73.2MB)
테스트 20 〉	통과 (2.49ms, 76.8MB)
테스트 21 〉	통과 (2.98ms, 77.9MB)
테스트 22 〉	통과 (3.13ms, 76.7MB)
테스트 23 〉	통과 (2.23ms, 76MB)
테스트 24 〉	통과 (2.53ms, 76.6MB)
테스트 25 〉	통과 (2.11ms, 72MB)
테스트 26 〉	통과 (2.94ms, 78.2MB)
테스트 27 〉	통과 (2.89ms, 75.5MB)
테스트 28 〉	통과 (3.56ms, 72.4MB)
테스트 29 〉	통과 (4.26ms, 82.1MB)
테스트 30 〉	통과 (8.84ms, 72MB)
```