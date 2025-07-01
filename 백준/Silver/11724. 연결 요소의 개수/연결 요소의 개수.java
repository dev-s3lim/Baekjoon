import java.io.*;
import java.util.*;

public class Main {
    static List<List<Integer>> adjList;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]); // 노드 갯수
        int M = Integer.parseInt(input[1]); // 간선의 갯수 (연결선)

        adjList = new ArrayList<>();
        visited = new boolean [N+1];

        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            String[] input2 = br.readLine().split(" ");
            int u = Integer.parseInt(input2[0]);
            int v = Integer.parseInt(input2[1]);

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if(!visited[i]) {
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static void dfs(int startNode) {
        visited[startNode] = true;
        
        for (int neighbor : adjList.get(startNode)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
}