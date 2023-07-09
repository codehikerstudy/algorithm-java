# 문자 리스트를 문자열로 변환하기

[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/181941)

## Solution1

```java
class Solution {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }
}
```

```
테스트 1 〉	통과 (0.04ms, 76.7MB)
테스트 2 〉	통과 (0.03ms, 75.5MB)
테스트 3 〉	통과 (0.07ms, 75MB)
테스트 4 〉	통과 (0.06ms, 76.3MB)
테스트 5 〉	통과 (0.04ms, 74.4MB)
테스트 6 〉	통과 (0.03ms, 76.8MB)
테스트 7 〉	통과 (0.04ms, 77.2MB)
테스트 8 〉	통과 (0.03ms, 73.6MB)
테스트 9 〉	통과 (0.02ms, 70.3MB)
테스트 10 〉	통과 (0.02ms, 76.3MB)
테스트 11 〉	통과 (0.04ms, 78.7MB)
테스트 12 〉	통과 (0.04ms, 79.6MB)
테스트 13 〉	통과 (0.03ms, 77.4MB)
테스트 14 〉	통과 (0.02ms, 76.9MB)
테스트 15 〉	통과 (0.05ms, 76.2MB)
```