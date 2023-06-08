# 문자열 섞기

[문제 바로 가기](https://school.programmers.co.kr/learn/courses/30/lessons/181942)

## Solution1

```java
class Solution {
    public String solution(String str1, String str2) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return sb.toString();
    }
}
```

```
테스트 1 〉	통과 (0.07ms, 76.5MB)
테스트 2 〉	통과 (0.09ms, 77.9MB)
테스트 3 〉	통과 (0.11ms, 78.1MB)
테스트 4 〉	통과 (0.11ms, 76.2MB)
테스트 5 〉	통과 (0.11ms, 72.8MB)
테스트 6 〉	통과 (0.07ms, 72.3MB)
테스트 7 〉	통과 (0.07ms, 80.1MB)
테스트 8 〉	통과 (0.08ms, 75.8MB)
테스트 9 〉	통과 (0.08ms, 76.9MB)
테스트 10 〉	통과 (0.09ms, 75.1MB)
테스트 11 〉	통과 (0.10ms, 75.2MB)
테스트 12 〉	통과 (0.08ms, 82.9MB)
테스트 13 〉	통과 (0.10ms, 74.8MB)
테스트 14 〉	통과 (0.10ms, 77.5MB)
테스트 15 〉	통과 (0.07ms, 76.5MB)
테스트 16 〉	통과 (0.07ms, 76.9MB)
테스트 17 〉	통과 (0.07ms, 71.5MB)
테스트 18 〉	통과 (0.08ms, 72MB)
테스트 19 〉	통과 (0.09ms, 72.7MB)
테스트 20 〉	통과 (0.06ms, 76.9MB)
테스트 21 〉	통과 (0.07ms, 74.5MB)
테스트 22 〉	통과 (0.08ms, 74.2MB)
테스트 23 〉	통과 (0.07ms, 72.6MB)
테스트 24 〉	통과 (0.08ms, 77.2MB)
```

## Solution2

- 전반적으로 StringBuilder를 쓰는 것이 StringBuffer를 쓰는 것보다 좀 더 성능이 좋게 나오는 것 같다.
- Solution1과의 차이점은 단순히 StringBuffer를 StringBuilder로 교체한 것이다.

```java
class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return sb.toString();
    }
}
```

```
테스트 1 〉	통과 (0.03ms, 77.4MB)
테스트 2 〉	통과 (0.03ms, 74.1MB)
테스트 3 〉	통과 (0.05ms, 77.9MB)
테스트 4 〉	통과 (0.04ms, 77.7MB)
테스트 5 〉	통과 (0.03ms, 75.3MB)
테스트 6 〉	통과 (0.03ms, 74.6MB)
테스트 7 〉	통과 (0.03ms, 72.8MB)
테스트 8 〉	통과 (0.05ms, 74.6MB)
테스트 9 〉	통과 (0.03ms, 72.9MB)
테스트 10 〉	통과 (0.03ms, 72.3MB)
테스트 11 〉	통과 (0.04ms, 79.7MB)
테스트 12 〉	통과 (0.03ms, 75.4MB)
테스트 13 〉	통과 (0.02ms, 72.8MB)
테스트 14 〉	통과 (0.03ms, 65.9MB)
테스트 15 〉	통과 (0.03ms, 72.1MB)
테스트 16 〉	통과 (0.03ms, 77.7MB)
테스트 17 〉	통과 (0.03ms, 74.1MB)
테스트 18 〉	통과 (0.03ms, 85.8MB)
테스트 19 〉	통과 (0.04ms, 80.9MB)
테스트 20 〉	통과 (0.04ms, 76.2MB)
테스트 21 〉	통과 (0.05ms, 72.3MB)
테스트 22 〉	통과 (0.05ms, 85.3MB)
테스트 23 〉	통과 (0.04ms, 72.7MB)
테스트 24 〉	통과 (0.03ms, 74.3MB)
```
