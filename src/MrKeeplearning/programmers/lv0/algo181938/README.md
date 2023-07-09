# 두 수의 연산값 비교하기

[문제 바로 가기](https://school.programmers.co.kr/learn/courses/30/lessons/181938)

## Solution1

```java
public class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int ab = Integer.parseInt(sb.append(a).append(b).toString());
        int two_ab = 2 * a * b;
        int answer = Math.max(ab, two_ab);
        return answer;
    }
}
```

```
테스트 1 〉	통과 (0.09ms, 75.4MB)
테스트 2 〉	통과 (0.07ms, 73.3MB)
테스트 3 〉	통과 (0.06ms, 76.1MB)
테스트 4 〉	통과 (0.14ms, 78.3MB)
테스트 5 〉	통과 (0.04ms, 73.6MB)
테스트 6 〉	통과 (0.12ms, 77.6MB)
테스트 7 〉	통과 (0.05ms, 74.3MB)
테스트 8 〉	통과 (0.06ms, 73.2MB)
테스트 9 〉	통과 (0.07ms, 78.3MB)
테스트 10 〉	통과 (0.05ms, 76.9MB)
테스트 11 〉	통과 (0.05ms, 71.9MB)
테스트 12 〉	통과 (0.04ms, 72.3MB)
테스트 13 〉	통과 (0.04ms, 76.1MB)
테스트 14 〉	통과 (0.04ms, 76.9MB)
테스트 15 〉	통과 (0.05ms, 74.2MB)
테스트 16 〉	통과 (0.05ms, 77.8MB)
테스트 17 〉	통과 (0.06ms, 77.8MB)
테스트 18 〉	통과 (0.10ms, 73.4MB)
테스트 19 〉	통과 (0.05ms, 73.9MB)
테스트 20 〉	통과 (0.05ms, 74.1MB)
테스트 21 〉	통과 (0.05ms, 72.3MB)
테스트 22 〉	통과 (0.05ms, 72.3MB)
테스트 23 〉	통과 (0.08ms, 73.7MB)
```