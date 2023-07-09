# 코드 처리하기

[문제 바로 가기](https://school.programmers.co.kr/learn/courses/30/lessons/181932)

## Solution1

- `StringBuffer`를 사용한 경우

```java
class Solution {
    public String solution(String code) {
        int mode = 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            /**
             * mode가 0일 때를 1일 때로 변경했다.
             * mode가 1일 때를 -1일 때로 변경했다.
             * mode에 -1을 곱하는 방식을 선택해서 간편하게 mode를 바꿀 수 있도록 설정했다.
             */
            if (c == '1') {
                mode *= -1;
            }
            if (i == 0 && c != '1') {
                sb.append(c);
            } else if (mode == 1 && c != '1' && i % 2 == 0) {
                sb.append(c);
            } else if (mode == -1 && c != '1' && i % 2 != 0) {
                sb.append(c);
            }
        }
        String ret = sb.toString();
        if (ret.length() == 0) {
            return "EMPTY";
        } else {
            return ret;
        }
    }
}
```

```
테스트 1 〉	통과 (12.53ms, 90.5MB)
테스트 2 〉	통과 (11.97ms, 88.6MB)
테스트 3 〉	통과 (2.70ms, 79.6MB)
테스트 4 〉	통과 (1.19ms, 77.1MB)
테스트 5 〉	통과 (5.76ms, 87.2MB)
테스트 6 〉	통과 (6.23ms, 77.2MB)
테스트 7 〉	통과 (2.79ms, 73.7MB)
테스트 8 〉	통과 (7.61ms, 76.7MB)
테스트 9 〉	통과 (7.47ms, 71MB)
테스트 10 〉	통과 (7.58ms, 84.1MB)
테스트 11 〉	통과 (4.79ms, 75.8MB)
테스트 12 〉	통과 (0.11ms, 76.5MB)
테스트 13 〉	통과 (0.07ms, 75.1MB)
```

- `StringBuilder`를 사용한 경우 조금 더 빠르고, 메모리도 좀 더 적게 사용하는 것을 확인할 수 있다.

```
테스트 1 〉	통과 (9.50ms, 79.8MB)
테스트 2 〉	통과 (10.41ms, 82.9MB)
테스트 3 〉	통과 (1.63ms, 78MB)
테스트 4 〉	통과 (1.23ms, 74.3MB)
테스트 5 〉	통과 (5.17ms, 91.2MB)
테스트 6 〉	통과 (5.96ms, 74.9MB)
테스트 7 〉	통과 (4.75ms, 80.6MB)
테스트 8 〉	통과 (7.47ms, 77.2MB)
테스트 9 〉	통과 (6.79ms, 81.4MB)
테스트 10 〉	통과 (8.95ms, 79.9MB)
테스트 11 〉	통과 (6.94ms, 71.5MB)
테스트 12 〉	통과 (0.05ms, 78.6MB)
테스트 13 〉	통과 (0.03ms, 71.3MB)
```

## Solution2

- mode를 변경하는 것을 다음과 같이 빼기 연산을 통해서 해결할 수도 있다.

```java
int mode = 0;

if(code.charAt(idx) == '1') {
    mode = 1 - mode;
}
```