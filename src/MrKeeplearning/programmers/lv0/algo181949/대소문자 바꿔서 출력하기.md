# 대소문자 바꿔서 출력하기

[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/181949)

## Solution1

- `StringBuffer`를 사용할 때가 `StringBuilder`를 사용할 때보다 빠름.
- StringBuffer 객체를 생성하여 사용한 케이스 (`StringBuffer sb = new StringBuffer(str);`)
    ```
    테스트 1 〉	통과 (133.36ms, 63.5MB)
    테스트 2 〉	통과 (169.67ms, 69.6MB)
    테스트 3 〉	통과 (132.35ms, 62.7MB)
    테스트 4 〉	통과 (128.91ms, 69.2MB)
    ```
- StringBuilder 객체를 생성하여 사용한 케이스 (`StringBuilder sb = new StringBuilder(str);`)
  ```
  테스트 1 〉	통과 (178.57ms, 61.8MB)
  테스트 2 〉	통과 (180.74ms, 74.1MB)
  테스트 3 〉	통과 (178.35ms, 66.9MB)
  테스트 4 〉	통과 (186.06ms, 64.2MB)
  ```

## Solution2

- `Solution2`에서와 같이 String에 `+` 연산자를 사용하는 방법을 채택할 수도 있지만, 권장하는 방법은 아니라고 한다.
  - [String concatenation in Java - when to use +, StringBuilder and concat](https://stackoverflow.com/questions/7817951/string-concatenation-in-java-when-to-use-stringbuilder-and-concat)
- IntelliJ 자체에서도 StringBuilder로 바꾸는 것을 권장한다고 알림이 뜬다.
  - `Convert variable 'answer' from String to StringBuilder`
  - for문 안에서 String에 `+`를 사용할 경우 for문이 순회할 때마다 `+`를 만나면 String 객체를 계속해서 생성하는 문제가 있다.
- 그리고 무엇보다 속도가 느리다.
  ```
  테스트 1 〉	통과 (231.73ms, 69.7MB)
  테스트 2 〉	통과 (240.60ms, 68.4MB)
  테스트 3 〉	통과 (234.83ms, 67.6MB)
  테스트 4 〉	통과 (205.56ms, 67.2MB)
  ```