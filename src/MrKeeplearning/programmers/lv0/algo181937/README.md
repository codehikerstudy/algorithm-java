# n의 배수

[문제 바로 가기](https://school.programmers.co.kr/learn/courses/30/lessons/181937)

```java
class Solution {
    public int solution(int num, int n) {
        int answer = num % n == 0 ? 1 : 0;
        return answer;
    }
}
```

```
테스트 1 〉	통과 (0.01ms, 75.7MB)
테스트 2 〉	통과 (0.02ms, 76.8MB)
테스트 3 〉	통과 (0.03ms, 74.9MB)
테스트 4 〉	통과 (0.02ms, 71.2MB)
테스트 5 〉	통과 (0.02ms, 73.7MB)
테스트 6 〉	통과 (0.03ms, 75.2MB)
테스트 7 〉	통과 (0.01ms, 78MB)
테스트 8 〉	통과 (0.02ms, 81.9MB)
테스트 9 〉	통과 (0.02ms, 77.8MB)
테스트 10 〉	통과 (0.01ms, 76MB)
테스트 11 〉	통과 (0.02ms, 75.4MB)
테스트 12 〉	통과 (0.01ms, 75.3MB)
테스트 13 〉	통과 (0.02ms, 73.1MB)
테스트 14 〉	통과 (0.03ms, 75.2MB)
테스트 15 〉	통과 (0.01ms, 72.6MB)
```
