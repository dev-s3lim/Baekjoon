import java.io.*;
import java.util.*;

public class Main {
    static List<List<Integer>> adjList;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        adjList = new ArrayList<>();
        visited = new boolean[N+1];

        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);

            adjList.get(X).add(Y);
            adjList.get(Y).add(X);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;

        int cnt = 0;
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(int a : adjList.get(tmp)) {
                if (!visited[a]) {
                    q.add(a);
                    visited[a] = true;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}