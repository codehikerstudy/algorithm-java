# 공배수

[문제 바로 가기](https://school.programmers.co.kr/learn/courses/30/lessons/181936)

```java
class Solution {
    public int solution(int number, int n, int m) {
        int answer = (number % n == 0 && number % m == 0) ? 1 : 0;
        return answer;
    }
}
```

```
테스트 1 〉	통과 (0.03ms, 71.8MB)
테스트 2 〉	통과 (0.02ms, 65.8MB)
테스트 3 〉	통과 (0.02ms, 73.8MB)
테스트 4 〉	통과 (0.03ms, 77MB)
테스트 5 〉	통과 (0.02ms, 71.2MB)
테스트 6 〉	통과 (0.01ms, 71.6MB)
테스트 7 〉	통과 (0.02ms, 74.2MB)
테스트 8 〉	통과 (0.02ms, 73.4MB)
테스트 9 〉	통과 (0.03ms, 77.4MB)
테스트 10 〉	통과 (0.03ms, 78.5MB)
테스트 11 〉	통과 (0.03ms, 75.2MB)
테스트 12 〉	통과 (0.02ms, 75.2MB)
테스트 13 〉	통과 (0.02ms, 73.9MB)
테스트 14 〉	통과 (0.02ms, 78.9MB)
테스트 15 〉	통과 (0.03ms, 75.3MB)
테스트 16 〉	통과 (0.03ms, 79.8MB)
테스트 17 〉	통과 (0.02ms, 75.8MB)
테스트 18 〉	통과 (0.01ms, 75.1MB)
테스트 19 〉	통과 (0.02ms, 74.9MB)
```