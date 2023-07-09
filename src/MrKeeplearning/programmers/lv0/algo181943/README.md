# 문자열 겹쳐쓰기

[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/181943)

# Solution1

```java
class Solution1 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int overwriteStringLength = overwrite_string.length();
        if (overwriteStringLength <= my_string.length() && my_string.length() <= 1000) {
            String head = my_string.substring(0, s);
            int substringEndIndex = s + overwriteStringLength - 1;
            // overwrite_string가 끝나는 지점과 my_string이 끝나는 지점이 동일하면 추가로 string을 이어붙일 필요가 없지만
            // 만약 overwrite한 부분 이후로 추가로 문자열이 있다면 해당 부분까지 이어서 값을 반환해야 한다.
            if (substringEndIndex != my_string.length() - 1) {
                String tail = my_string.substring(substringEndIndex + 1);
                answer = head + overwrite_string + tail;
            } else {
                answer = head + overwrite_string;
            }
        } else {
            System.out.println("Please check the constraints");
        }
        return answer;
    }
}
```

```
테스트 1 〉	통과 (1.31ms, 75.2MB)
테스트 2 〉	통과 (14.77ms, 77.4MB)
테스트 3 〉	통과 (11.38ms, 83.4MB)
테스트 4 〉	통과 (1.42ms, 74.6MB)
테스트 5 〉	통과 (11.88ms, 77.7MB)
테스트 6 〉	통과 (12.04ms, 78.9MB)
테스트 7 〉	통과 (11.43ms, 83.5MB)
테스트 8 〉	통과 (11.43ms, 67.3MB)
테스트 9 〉	통과 (11.89ms, 82.8MB)
테스트 10 〉	통과 (12.62ms, 80.8MB)
테스트 11 〉	통과 (12.62ms, 71.6MB)
테스트 12 〉	통과 (14.60ms, 73.1MB)
테스트 13 〉	통과 (12.60ms, 77.1MB)
테스트 14 〉	통과 (13.49ms, 85.5MB)
테스트 15 〉	통과 (10.14ms, 68.7MB)
테스트 16 〉	통과 (1.16ms, 67.6MB)
테스트 17 〉	통과 (12.81ms, 87MB)
테스트 18 〉	통과 (9.68ms, 84.5MB)
```

## Solution2

문자열을 더할 때는 항상 StringBuffer나 StringBuilder를 사용하도록 하자. 훨씬 빠르다.

```java
package MrKeeplearning.programmers.lv0.algo181943;

class Solution2 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        answer = sb.toString();
        return answer;
    }
}
```

```
테스트 1 〉	통과 (0.09ms, 71.7MB)
테스트 2 〉	통과 (0.15ms, 82.2MB)
테스트 3 〉	통과 (0.11ms, 77.9MB)
테스트 4 〉	통과 (0.11ms, 80.2MB)
테스트 5 〉	통과 (0.10ms, 80.9MB)
테스트 6 〉	통과 (0.08ms, 72.7MB)
테스트 7 〉	통과 (0.10ms, 75.3MB)
테스트 8 〉	통과 (0.11ms, 74.4MB)
테스트 9 〉	통과 (0.07ms, 78MB)
테스트 10 〉	통과 (0.09ms, 76.3MB)
테스트 11 〉	통과 (0.09ms, 64.9MB)
테스트 12 〉	통과 (0.10ms, 81.4MB)
테스트 13 〉	통과 (0.10ms, 72.7MB)
테스트 14 〉	통과 (0.11ms, 77.4MB)
테스트 15 〉	통과 (0.12ms, 71.4MB)
테스트 16 〉	통과 (0.08ms, 75.6MB)
테스트 17 〉	통과 (0.10ms, 78.4MB)
테스트 18 〉	통과 (0.09ms, 73.2MB)
```

## Solution3

```java
class Solution3 {
    public String solution(String my_string, String overwrite_string, int s) {
        String head = my_string.substring(0, s);
        String tail = my_string.substring(s + overwrite_string.length());
        return head + overwrite_string + tail;
    }
}
```

```
테스트 1 〉	통과 (24.04ms, 74.8MB)
테스트 2 〉	통과 (14.96ms, 74.4MB)
테스트 3 〉	통과 (12.83ms, 77.7MB)
테스트 4 〉	통과 (19.38ms, 73MB)
테스트 5 〉	통과 (14.91ms, 90.4MB)
테스트 6 〉	통과 (14.93ms, 76.4MB)
테스트 7 〉	통과 (16.64ms, 73.5MB)
테스트 8 〉	통과 (12.88ms, 76.7MB)
테스트 9 〉	통과 (17.44ms, 77.8MB)
테스트 10 〉	통과 (14.54ms, 84.4MB)
테스트 11 〉	통과 (15.12ms, 82.5MB)
테스트 12 〉	통과 (12.36ms, 91MB)
테스트 13 〉	통과 (18.54ms, 86.3MB)
테스트 14 〉	통과 (16.14ms, 74.3MB)
테스트 15 〉	통과 (12.71ms, 83.9MB)
테스트 16 〉	통과 (18.14ms, 76.6MB)
테스트 17 〉	통과 (14.77ms, 78MB)
테스트 18 〉	통과 (14.43ms, 85.4MB)
```