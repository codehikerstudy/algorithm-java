package MrKeeplearning.boj.boj24479;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    final static int MAX = 100000 + 10;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N, M, R;
    static int[] answer;
    static int order;

    // DFS 함수 구현
    public static void dfs(int idx) {
        visited[idx] = true;
        // order는 내가 지금 몇 번째 방문에 해당하는지 순서를 담고 있음
        // 이 순서를 answer배열에 해당하는 인덱스에 담아준다.
        answer[idx] = order;
        order++;

        // ArrayList를 하나씩 탐색
        for (int i = 0; i < graph[idx].size(); i++) {
            // 다음 방문할 노드를 next라고 함.
            // 그래프의 인덱스를 기준으로, 해당 인덱스에 연결된 i번째 요소를 next라는 int변수에 담아준다.
            int next = graph[idx].get(i);

            // 다음으로 방문하려는 노드가 방문한 적이 없는가?
            // 없다면 DFS 수행!
            if (!visited[next]) {
                dfs(next);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        // 1. graph에 연결 정보 채우기
        graph = new ArrayList[MAX];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[MAX];
        answer = new int[MAX];
        order = 1;  // 현재 DFS를 방문하는 순서를 가지고 있는 변수. 1로 초기화를 하고 매번 방문할 때마다 1씩 증가.'

        for (int i = 0; i < M; i++) {
            // 입력 받은 것을 띄어쓰기를 기준으로 구분
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            // 2차원 배열이 아니기 때문에 add함수를 사용한다.
            graph[x].add(y);
            graph[y].add(x);
        }

        // 2. 오름차순 정렬
        // 각각의 ArrayList를 정렬한다.
        // 별다른 인자를 전달하지 않았기 때문에 오름차순으로 정렬한다.
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // 3. DFS(재귀함수 호출)
        dfs(R);

        // 4. 출력
        for (int i = 1; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
