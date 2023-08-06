package MrKeeplearning.boj.boj2606;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 0번, 1번, 3번, 2번 순으로 작성한다.
 * 2번에는 미리 dfs()함수를 만들었다고 가정하고 dfs(1)만 선언한 뒤 바로 3번으로 넘어가서 작성한다.
 */
public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    /*
    DFS 함수 작성하기

    - 현재 내가 몇 번쨰 인덱스를 처리하고 있는지 그것을 인자로 받아서 동작한다.
    - 맨처음에는 1번 컴퓨터 확인을 하기 때문에 main함수에서 dfs(1)을 작성한 것이다.
      그리고 1번 인덱스는 true가 되어 다시 방문하지 않게 된다.
    -
    */
    public static void dfs(int idx) {
        visited[idx] = true;
        // dfs함수가 호출되는 횟수만큼 몇 개의 컴퓨터가 연결되었는지를 의미한다.
        // answer를 여기서 증가시키면 answer라는 변수는 n번과 연결되어 있는 컴퓨터의 개수를 잘 가지고 있을 것이다.
        answer++;
        // 현재의 인덱스를 기준으로 나와 연결되어 있는 아이가 1번부터 N번까지 누가 있는지,
        // 그리고 연결되어 있다면 그 다음 재귀함수를 호출하기 위해서 이러한 동작을 하는 것이다.
        for (int i = 1; i <= N; i++) {
            // i번 컴퓨터를 방문한 적이 없는 것이 맞는지 가장 처음으로 확인하고
            // graph[idx][i]가 true가 맞는지, 즉 인덱스를 기준으로 i번 컴퓨터와 연결이 되어 있는지 확인해야 한다.
            // 요약하면, i번 컴퓨터에 방문하지 않았는데, 지금 들어온 idx번 컴퓨터와 i번 컴퓨터가 서로 연결이 되어 있다면
            // dfs라는 재귀함수를 통해서 i번째 컴퓨터에 가는 것이 맞겠다는 의미에서 DFS의 i를 호출한다.
            if(visited[i] == false && graph[idx][i] == true) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        // 코테에서 입력과 출력을 빠르게 하기 위한 공식과 같은 구문
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 받은 String을 Integer로 변환해서 N에 담겠다.
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        // 7까지 탐색을 해야 하는데 컴퓨터는 0부터 시작하기 때문에 N+1을 사용
        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        // 1. graph에 연결 정보 채우기
        int x, y;
        // M개의 간선 정보를 순회하면서 입력을 받음
        // 2개의 숫자가 한 줄에 들어오기 때문에 StringTokenizer를 사용해야 한다.
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 띄어쓰기를 기준으로 나눈 것 중에 다음 것을 달라는 의미
            // nextToken을 처음 호출했기 때문에 첫 번째 숫자를 받게 된다.
            // String 형태로 받은 것이기 때문에 Integer 형변환이 필요하다.
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        // 2. dfs(재귀함수) 호출
        dfs(1);

        /*
         3. 정답 출력

         BufferedWriter를 통해서 write를 할 것인데, write할 내용은 answer라는 변수에 정답이 잘 담겨 있을 것이라고 가정하는 것이다.
         answer는 1번을 포함해서 몇 개의 컴퓨터가 감염이 되었는지, 즉 1번과 연결되어 있는 컴퓨터가 몇 대인지 정보를 가지고 있다.

         우리가 알아야 하는 것은 1번은 제외한 값이므로 1을 제외해야 정답이 된다.

         BufferedWriter도 String 형태로 전달해야 하기 때문에 String.valueOf 함수를 통해서 Integer를 String 형태로 변환하고
         변환된 값을 BufferedWriter로 write를 해주면 정답이 된다.
        */
        bw.write(String.valueOf(answer - 1));

        br.close();
        bw.close();
    }
}