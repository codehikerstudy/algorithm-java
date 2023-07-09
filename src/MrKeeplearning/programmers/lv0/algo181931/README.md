# 등차수열의 특정한 항만 더하기

[문제 바로 가기](https://school.programmers.co.kr/learn/courses/30/lessons/181931)

## Solution1

```java
public class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                answer += a + i * d;
            }
        }
        return answer;
    }
}
```

```
테스트 1 〉	통과 (0.04ms, 76.3MB)
테스트 2 〉	통과 (0.02ms, 72.3MB)
테스트 3 〉	통과 (0.02ms, 71.1MB)
테스트 4 〉	통과 (0.02ms, 71.6MB)
테스트 5 〉	통과 (0.04ms, 76.7MB)
테스트 6 〉	통과 (0.02ms, 66.1MB)
테스트 7 〉	통과 (0.03ms, 79.8MB)
테스트 8 〉	통과 (0.02ms, 76MB)
테스트 9 〉	통과 (0.03ms, 73.8MB)
테스트 10 〉	통과 (0.05ms, 73.6MB)
테스트 11 〉	통과 (0.03ms, 73.3MB)
테스트 12 〉	통과 (0.03ms, 75.5MB)
테스트 13 〉	통과 (0.03ms, 82.2MB)
테스트 14 〉	통과 (0.04ms, 73MB)
테스트 15 〉	통과 (0.03ms, 66.6MB)
테스트 16 〉	통과 (0.02ms, 74MB)
테스트 17 〉	통과 (0.03ms, 66.7MB)
테스트 18 〉	통과 (0.03ms, 73.1MB)
테스트 19 〉	통과 (0.03ms, 77.3MB)
테스트 20 〉	통과 (0.03ms, 85.1MB)
테스트 21 〉	통과 (0.04ms, 74.5MB)
테스트 22 〉	통과 (0.03ms, 72.2MB)
테스트 23 〉	통과 (0.04ms, 73MB)
테스트 24 〉	통과 (0.03ms, 70.3MB)
테스트 25 〉	통과 (0.04ms, 74.6MB)
테스트 26 〉	통과 (0.03ms, 81.1MB)
테스트 27 〉	통과 (0.04ms, 77.8MB)
테스트 28 〉	통과 (0.05ms, 76.4MB)
```