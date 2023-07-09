# 문자열 곱하기

[문제 바로 가기](https://school.programmers.co.kr/learn/courses/30/lessons/181940)

## Solution1: String의 repeat 메서드 활용

```java
class Solution1 {
    public String solution(String my_string, int k) {
        String answer = my_string.repeat(k);
        return answer;
    }
}
```

```
테스트 1 〉	통과 (0.02ms, 74.5MB)
테스트 2 〉	통과 (0.05ms, 74MB)
테스트 3 〉	통과 (0.02ms, 80.6MB)
테스트 4 〉	통과 (0.03ms, 75.8MB)
테스트 5 〉	통과 (0.02ms, 76.8MB)
테스트 6 〉	통과 (0.02ms, 68.7MB)
테스트 7 〉	통과 (0.02ms, 76.6MB)
테스트 8 〉	통과 (0.02ms, 78.6MB)
테스트 9 〉	통과 (0.04ms, 74.7MB)
테스트 10 〉	통과 (0.03ms, 73.6MB)
테스트 11 〉	통과 (0.02ms, 78.3MB)
테스트 12 〉	통과 (0.03ms, 72MB)
테스트 13 〉	통과 (0.04ms, 87.1MB)
테스트 14 〉	통과 (0.03ms, 68.5MB)
테스트 15 〉	통과 (0.04ms, 78.9MB)
테스트 16 〉	통과 (0.04ms, 71.8MB)
테스트 17 〉	통과 (0.03ms, 72.4MB)
테스트 18 〉	통과 (0.03ms, 69.9MB)
테스트 19 〉	통과 (0.03ms, 79.8MB)
테스트 20 〉	통과 (0.03ms, 77.9MB)
테스트 21 〉	통과 (0.03ms, 83.2MB)
테스트 22 〉	통과 (0.02ms, 74.4MB)
테스트 23 〉	통과 (0.03ms, 77MB)
테스트 24 〉	통과 (0.02ms, 78.5MB)
테스트 25 〉	통과 (0.04ms, 76MB)
```

## Solution2: StringBuilder 활용

근소한 차이로 `repeat()`메서드를 활용하는 것이 아주 조금 빠른 것 같다.

```java
class Solution2 {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
    }
}
```

```
테스트 1 〉	통과 (0.02ms, 77.7MB)
테스트 2 〉	통과 (0.04ms, 73.2MB)
테스트 3 〉	통과 (0.03ms, 74.4MB)
테스트 4 〉	통과 (0.09ms, 75.9MB)
테스트 5 〉	통과 (0.05ms, 76.3MB)
테스트 6 〉	통과 (0.03ms, 75.2MB)
테스트 7 〉	통과 (0.05ms, 79.9MB)
테스트 8 〉	통과 (0.04ms, 66.3MB)
테스트 9 〉	통과 (0.05ms, 68.5MB)
테스트 10 〉	통과 (0.05ms, 64.9MB)
테스트 11 〉	통과 (0.02ms, 74.3MB)
테스트 12 〉	통과 (0.03ms, 75.7MB)
테스트 13 〉	통과 (0.05ms, 78.2MB)
테스트 14 〉	통과 (0.05ms, 73.6MB)
테스트 15 〉	통과 (0.06ms, 78.3MB)
테스트 16 〉	통과 (0.03ms, 75.1MB)
테스트 17 〉	통과 (0.06ms, 73.4MB)
테스트 18 〉	통과 (0.05ms, 74MB)
테스트 19 〉	통과 (0.07ms, 79.3MB)
테스트 20 〉	통과 (0.05ms, 72.4MB)
테스트 21 〉	통과 (0.03ms, 70.7MB)
테스트 22 〉	통과 (0.05ms, 86.1MB)
테스트 23 〉	통과 (0.04ms, 73.9MB)
테스트 24 〉	통과 (0.05ms, 75.3MB)
테스트 25 〉	통과 (0.12ms, 78.6MB)
```

## Solution3: array 활용

```java
class Solution3 {
    public String solution(String my_string, int k) {
        // 고정된 길이의 array를 생성
        String[] strings = new String[k];
        for (int i = 0; i < k; i++) {
            strings[i] = my_string;
        }
        String stringArray = convertStringArrayToString(strings);
        return stringArray;
    }

    private static String convertStringArrayToString(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s);
        }
        return sb.toString();
    }
}
```

```
테스트 1 〉	통과 (0.03ms, 76.1MB)
테스트 2 〉	통과 (0.02ms, 74.7MB)
테스트 3 〉	통과 (0.04ms, 68.4MB)
테스트 4 〉	통과 (0.03ms, 74.5MB)
테스트 5 〉	통과 (0.04ms, 74.1MB)
테스트 6 〉	통과 (0.04ms, 76.2MB)
테스트 7 〉	통과 (0.10ms, 80.2MB)
테스트 8 〉	통과 (0.06ms, 73.5MB)
테스트 9 〉	통과 (0.04ms, 76.2MB)
테스트 10 〉	통과 (0.04ms, 77.4MB)
테스트 11 〉	통과 (0.02ms, 73.9MB)
테스트 12 〉	통과 (0.03ms, 75.3MB)
테스트 13 〉	통과 (0.03ms, 71.9MB)
테스트 14 〉	통과 (0.04ms, 74.7MB)
테스트 15 〉	통과 (0.05ms, 73.9MB)
테스트 16 〉	통과 (0.03ms, 76.5MB)
테스트 17 〉	통과 (0.05ms, 67.4MB)
테스트 18 〉	통과 (0.05ms, 77MB)
테스트 19 〉	통과 (0.06ms, 76.7MB)
테스트 20 〉	통과 (0.06ms, 73.4MB)
테스트 21 〉	통과 (0.06ms, 76.1MB)
테스트 22 〉	통과 (0.04ms, 76.3MB)
테스트 23 〉	통과 (0.05ms, 73.1MB)
테스트 24 〉	통과 (0.08ms, 79.3MB)
테스트 25 〉	통과 (0.06ms, 74.5MB)
```

## Solution4: Arrays.fill() 활용

```java
import java.util.Arrays;

class Solution4 {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        String stringToApppend = my_string;
        String[] strings = new String[k];
        Arrays.fill(strings, stringToApppend);
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
}
```

```
테스트 1 〉	통과 (0.03ms, 76MB)
테스트 2 〉	통과 (0.04ms, 79.8MB)
테스트 3 〉	통과 (0.05ms, 65.2MB)
테스트 4 〉	통과 (0.05ms, 76.3MB)
테스트 5 〉	통과 (0.06ms, 79.8MB)
테스트 6 〉	통과 (0.04ms, 77MB)
테스트 7 〉	통과 (0.03ms, 68.3MB)
테스트 8 〉	통과 (0.04ms, 82.9MB)
테스트 9 〉	통과 (0.06ms, 79.3MB)
테스트 10 〉	통과 (0.09ms, 74.5MB)
테스트 11 〉	통과 (0.04ms, 79.7MB)
테스트 12 〉	통과 (0.04ms, 74.5MB)
테스트 13 〉	통과 (0.04ms, 78.3MB)
테스트 14 〉	통과 (0.04ms, 73.5MB)
테스트 15 〉	통과 (0.07ms, 72.5MB)
테스트 16 〉	통과 (0.03ms, 74.7MB)
테스트 17 〉	통과 (0.06ms, 77.2MB)
테스트 18 〉	통과 (0.09ms, 79.5MB)
테스트 19 〉	통과 (0.06ms, 82.1MB)
테스트 20 〉	통과 (0.08ms, 71.4MB)
테스트 21 〉	통과 (0.06ms, 76.3MB)
테스트 22 〉	통과 (0.08ms, 72.9MB)
테스트 23 〉	통과 (0.06ms, 76.2MB)
테스트 24 〉	통과 (0.07ms, 81.4MB)
테스트 25 〉	통과 (0.09ms, 75.7MB)
```

## Solution5: nCopies 메서드 활용

- `java.util` 패키지의 `Collections` 클래스에서 `nCopies` 메서드를 사용하는 것도 가능하다.
- 고정된 길이의 배열을 사용하는 것보다는 덜 효과적인 방법.

```java
import java.util.Collections;

class Solution5 {
    public String solution(String my_string, int k) {
        String answer = String.join("", Collections.nCopies(k, my_string));
        return answer;
    }
}
```

```
테스트 1 〉	통과 (0.31ms, 78.2MB)
테스트 2 〉	통과 (0.31ms, 67.5MB)
테스트 3 〉	통과 (0.65ms, 75.1MB)
테스트 4 〉	통과 (0.27ms, 74.4MB)
테스트 5 〉	통과 (0.51ms, 65.9MB)
테스트 6 〉	통과 (0.25ms, 77.5MB)
테스트 7 〉	통과 (0.34ms, 67.5MB)
테스트 8 〉	통과 (0.31ms, 76.5MB)
테스트 9 〉	통과 (0.45ms, 75.1MB)
테스트 10 〉	통과 (0.48ms, 85.9MB)
테스트 11 〉	통과 (0.28ms, 81.9MB)
테스트 12 〉	통과 (0.39ms, 81.7MB)
테스트 13 〉	통과 (0.38ms, 72MB)
테스트 14 〉	통과 (0.53ms, 73.1MB)
테스트 15 〉	통과 (0.65ms, 77.7MB)
테스트 16 〉	통과 (0.21ms, 76.5MB)
테스트 17 〉	통과 (0.40ms, 78MB)
테스트 18 〉	통과 (0.59ms, 66.5MB)
테스트 19 〉	통과 (0.52ms, 78.5MB)
테스트 20 〉	통과 (0.81ms, 82.1MB)
테스트 21 〉	통과 (0.28ms, 70.8MB)
테스트 22 〉	통과 (0.42ms, 73.5MB)
테스트 23 〉	통과 (0.57ms, 79.1MB)
테스트 24 〉	통과 (0.71ms, 72.6MB)
테스트 25 〉	통과 (0.60ms, 71.9MB)
```

## Solution6

- 자바 Stream의 generate 메서드를 활용하여 문자열을 생성하는 방법
- 가장 느린 결과를 보여준다.

```java
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution6 {
    public String solution(String my_string, int k) {
        String answer = Stream.generate(() -> my_string).limit(k).collect(Collectors.joining());
        return answer;
    }
}
```

```
테스트 1 〉	통과 (1.76ms, 72.8MB)
테스트 2 〉	통과 (2.00ms, 76.5MB)
테스트 3 〉	통과 (1.88ms, 77.2MB)
테스트 4 〉	통과 (2.90ms, 74.6MB)
테스트 5 〉	통과 (1.80ms, 78.1MB)
테스트 6 〉	통과 (2.15ms, 77.4MB)
테스트 7 〉	통과 (2.60ms, 74.6MB)
테스트 8 〉	통과 (2.59ms, 93.6MB)
테스트 9 〉	통과 (2.43ms, 70.9MB)
테스트 10 〉	통과 (1.74ms, 73.8MB)
테스트 11 〉	통과 (1.87ms, 75MB)
테스트 12 〉	통과 (1.82ms, 77.8MB)
테스트 13 〉	통과 (2.42ms, 74.9MB)
테스트 14 〉	통과 (1.89ms, 74.6MB)
테스트 15 〉	통과 (2.65ms, 75MB)
테스트 16 〉	통과 (2.04ms, 75.8MB)
테스트 17 〉	통과 (1.97ms, 73.9MB)
테스트 18 〉	통과 (1.77ms, 74.4MB)
테스트 19 〉	통과 (2.43ms, 80.4MB)
테스트 20 〉	통과 (2.88ms, 82.9MB)
테스트 21 〉	통과 (2.56ms, 77.1MB)
테스트 22 〉	통과 (2.76ms, 80.5MB)
테스트 23 〉	통과 (2.28ms, 75MB)
테스트 24 〉	통과 (1.91ms, 76.5MB)
테스트 25 〉	통과 (1.81ms, 76.8MB)
```
