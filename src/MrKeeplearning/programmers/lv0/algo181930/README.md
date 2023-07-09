# 주사위 게임 2

[문제 바로 가기](https://school.programmers.co.kr/learn/courses/30/lessons/181930)

## Solution1

```java
import static java.lang.Math.pow;

public class Solution {
    public int solution(int a, int b, int c) {
        int answer;
        if (a == b && a == c) {
            answer = allSame(a, b, c);
        } else if (a != b && a != c && b != c) {
            answer = allDiff(a, b, c);
        } else {
            answer = diff(a, b, c);
        }
        return answer;
    }

    public int allDiff(int a, int b, int c) {
        return a + b + c;
    }

    public int diff(int a, int b, int c) {
        return allDiff(a, b, c) * (int)(pow(a, 2) + pow(b, 2) + pow(c, 2));
    }

    public int allSame(int a, int b, int c) {
        return diff(a, b, c) * (int)(pow(a, 3) + pow(b, 3) + pow(c, 3));
    }
}
```

```
테스트 1 〉	통과 (0.04ms, 73.3MB)
테스트 2 〉	통과 (0.04ms, 77.5MB)
테스트 3 〉	통과 (0.05ms, 78.8MB)
테스트 4 〉	통과 (0.01ms, 74.9MB)
테스트 5 〉	통과 (0.05ms, 78.1MB)
테스트 6 〉	통과 (0.05ms, 74.3MB)
테스트 7 〉	통과 (0.02ms, 79.5MB)
테스트 8 〉	통과 (0.10ms, 82.3MB)
테스트 9 〉	통과 (0.04ms, 74.3MB)
테스트 10 〉	통과 (0.02ms, 75.4MB)
테스트 11 〉	통과 (0.11ms, 74.5MB)
테스트 12 〉	통과 (0.10ms, 70.6MB)
테스트 13 〉	통과 (0.06ms, 76MB)
테스트 14 〉	통과 (0.04ms, 75.2MB)
테스트 15 〉	통과 (0.05ms, 75MB)
테스트 16 〉	통과 (0.10ms, 73.6MB)
테스트 17 〉	통과 (0.01ms, 75.3MB)
테스트 18 〉	통과 (0.04ms, 79.7MB)
테스트 19 〉	통과 (0.05ms, 71.1MB)
테스트 20 〉	통과 (0.04ms, 69.3MB)
테스트 21 〉	통과 (0.02ms, 73.5MB)
테스트 22 〉	통과 (0.02ms, 76.9MB)
테스트 23 〉	통과 (0.03ms, 84MB)
테스트 24 〉	통과 (0.06ms, 76.7MB)
테스트 25 〉	통과 (0.04ms, 76.4MB)
테스트 26 〉	통과 (0.02ms, 76.2MB)
테스트 27 〉	통과 (0.12ms, 76.2MB)
테스트 28 〉	통과 (0.04ms, 77.1MB)
테스트 29 〉	통과 (0.02ms, 77.6MB)
테스트 30 〉	통과 (0.04ms, 83.6MB)
테스트 31 〉	통과 (0.02ms, 73.3MB)
테스트 32 〉	통과 (0.02ms, 75.6MB)
테스트 33 〉	통과 (0.04ms, 70.3MB)
테스트 34 〉	통과 (0.01ms, 76.5MB)
테스트 35 〉	통과 (0.07ms, 76.8MB)
테스트 36 〉	통과 (0.03ms, 77.4MB)
테스트 37 〉	통과 (0.04ms, 74.6MB)
테스트 38 〉	통과 (0.11ms, 75MB)
테스트 39 〉	통과 (0.04ms, 75.5MB)
테스트 40 〉	통과 (0.11ms, 76.3MB)
테스트 41 〉	통과 (0.05ms, 77.6MB)
테스트 42 〉	통과 (0.04ms, 77.9MB)
테스트 43 〉	통과 (0.04ms, 73.1MB)
테스트 44 〉	통과 (0.04ms, 76.7MB)
테스트 45 〉	통과 (0.02ms, 78.8MB)
테스트 46 〉	통과 (0.06ms, 72.5MB)
테스트 47 〉	통과 (0.06ms, 78.1MB)
테스트 48 〉	통과 (0.02ms, 82.7MB)
테스트 49 〉	통과 (0.03ms, 75.2MB)
테스트 50 〉	통과 (0.03ms, 76.4MB)
테스트 51 〉	통과 (0.02ms, 75.2MB)
테스트 52 〉	통과 (0.02ms, 73.4MB)
테스트 53 〉	통과 (0.01ms, 80.5MB)
테스트 54 〉	통과 (0.02ms, 75.3MB)
테스트 55 〉	통과 (0.04ms, 77.1MB)
테스트 56 〉	통과 (0.03ms, 75.7MB)
```