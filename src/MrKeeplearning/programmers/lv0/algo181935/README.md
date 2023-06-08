# 홀짝에 따라 다른 값 반환하기

[문제 바로 가기](https://school.programmers.co.kr/learn/courses/30/lessons/181935)

```java
public class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) {
            answer = evenSum(n);
        } else {
            answer = oddSum(n);
        }
        return answer;
    }

    private int evenSum(int n) {
        int i = 0;
        int sum = 0;
        while (i <= n) {
            sum += i*i;
            i += 2;
        }
        return sum;
    }

    private int oddSum(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
```

```
테스트 1 〉	통과 (0.02ms, 74.5MB)
테스트 2 〉	통과 (0.03ms, 74.2MB)
테스트 3 〉	통과 (0.02ms, 77.3MB)
테스트 4 〉	통과 (0.03ms, 73.4MB)
테스트 5 〉	통과 (0.02ms, 78.1MB)
테스트 6 〉	통과 (0.03ms, 76.8MB)
테스트 7 〉	통과 (0.02ms, 72.6MB)
테스트 8 〉	통과 (0.02ms, 76.7MB)
테스트 9 〉	통과 (0.04ms, 75.4MB)
테스트 10 〉	통과 (0.02ms, 76.3MB)
테스트 11 〉	통과 (0.02ms, 70MB)
테스트 12 〉	통과 (0.02ms, 76.3MB)
테스트 13 〉	통과 (0.03ms, 78.9MB)
테스트 14 〉	통과 (0.03ms, 74.8MB)
테스트 15 〉	통과 (0.04ms, 76MB)
테스트 16 〉	통과 (0.03ms, 70.2MB)
테스트 17 〉	통과 (0.02ms, 80.6MB)
테스트 18 〉	통과 (0.04ms, 73MB)
테스트 19 〉	통과 (0.02ms, 72.5MB)
테스트 20 〉	통과 (0.02ms, 78.4MB)
```