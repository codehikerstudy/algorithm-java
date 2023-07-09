# 더 크게 합치기

[문제 바로 가기](https://school.programmers.co.kr/learn/courses/30/lessons/181939)

💡 밑에서 `Integer.max`를 활용하고 있는데, `Integer.max`를 들어가보면 `Math.max`를 리턴하는 것을 확인할 수 있다. 따라서 `Math.max`를 사용하는 것이 좀 더 나을 것 같다.

## Solution1: StringBuffer를 사용

```java
class Solution {
    public int solution(int a, int b) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        String str1 = sb1.append(a).append(b).toString();
        String str2 = sb2.append(b).append(a).toString();
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int result = Integer.max(num1, num2);
        return result;
    }
}
```

```
테스트 1 〉	통과 (0.12ms, 76.7MB)
테스트 2 〉	통과 (0.08ms, 77.8MB)
테스트 3 〉	통과 (0.15ms, 76.7MB)
테스트 4 〉	통과 (0.09ms, 66.3MB)
테스트 5 〉	통과 (0.09ms, 75.6MB)
테스트 6 〉	통과 (0.14ms, 77.9MB)
테스트 7 〉	통과 (0.15ms, 75.4MB)
테스트 8 〉	통과 (0.16ms, 77.4MB)
테스트 9 〉	통과 (0.11ms, 73.7MB)
테스트 10 〉	통과 (0.13ms, 79.3MB)
테스트 11 〉	통과 (0.09ms, 75.8MB)
테스트 12 〉	통과 (0.13ms, 77.2MB)
테스트 13 〉	통과 (0.09ms, 79.9MB)
테스트 14 〉	통과 (0.09ms, 76.3MB)
테스트 15 〉	통과 (0.12ms, 67.1MB)
테스트 16 〉	통과 (0.09ms, 71.4MB)
테스트 17 〉	통과 (0.10ms, 74MB)
테스트 18 〉	통과 (0.10ms, 77MB)
테스트 19 〉	통과 (0.08ms, 72.6MB)
테스트 20 〉	통과 (0.11ms, 78.2MB)
테스트 21 〉	통과 (0.10ms, 72.7MB)
테스트 22 〉	통과 (0.08ms, 73.8MB)
테스트 23 〉	통과 (0.09ms, 70.9MB)
```

## Solution2: StringBuilder를 사용

```java
class Solution {
    public int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str1 = sb1.append(a).append(b).toString();
        String str2 = sb2.append(b).append(a).toString();
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int result = Integer.max(num1, num2);
        return result;
    }
}
```

```
테스트 1 〉	통과 (0.05ms, 75.2MB)
테스트 2 〉	통과 (0.05ms, 75.7MB)
테스트 3 〉	통과 (0.05ms, 75.8MB)
테스트 4 〉	통과 (0.03ms, 73.9MB)
테스트 5 〉	통과 (0.04ms, 78.4MB)
테스트 6 〉	통과 (0.07ms, 74.1MB)
테스트 7 〉	통과 (0.05ms, 72.6MB)
테스트 8 〉	통과 (0.04ms, 76.4MB)
테스트 9 〉	통과 (0.04ms, 78.9MB)
테스트 10 〉	통과 (0.07ms, 77MB)
테스트 11 〉	통과 (0.06ms, 73.9MB)
테스트 12 〉	통과 (0.05ms, 81.3MB)
테스트 13 〉	통과 (0.04ms, 77.7MB)
테스트 14 〉	통과 (0.11ms, 74.1MB)
테스트 15 〉	통과 (0.05ms, 76.3MB)
테스트 16 〉	통과 (0.05ms, 76MB)
테스트 17 〉	통과 (0.04ms, 69.5MB)
테스트 18 〉	통과 (0.04ms, 82.8MB)
테스트 19 〉	통과 (0.04ms, 72.4MB)
테스트 20 〉	통과 (0.05ms, 72.7MB)
테스트 21 〉	통과 (0.05ms, 79.1MB)
테스트 22 〉	통과 (0.05ms, 76.7MB)
테스트 23 〉	통과 (0.04ms, 72.5MB)
```