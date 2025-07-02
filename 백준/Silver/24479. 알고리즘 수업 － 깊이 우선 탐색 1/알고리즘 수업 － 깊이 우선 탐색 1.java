import java.io.*;
import java.util.*;

public class Main {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] visitedOrder;
    static int order = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);

        adjList = new ArrayList<>();
        visited = new boolean[N+1];
        visitedOrder = new int [N+1];

        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] input2 = br.readLine().split(" ");
            int U = Integer.parseInt(input2[0]);
            int V = Integer.parseInt(input2[1]);

            adjList.get(U).add(V);
            adjList.get(V).add(U);
        }

        for (int i = 0; i < N; i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }

        dfs(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(visitedOrder[i]);
        }
    }

    static void dfs (int start) {
        visited[start] = true;
        visitedOrder[start] = order++;
        for (int a : adjList.get(start)) {
            if (!visited[a]) {
                dfs(a);
            }
        }
    }
}