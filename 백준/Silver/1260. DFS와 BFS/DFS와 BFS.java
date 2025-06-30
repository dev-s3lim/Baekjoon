import java.io.*;
import java.util.*;

public class Main {
    static List<List<Integer>> adjList;
    static boolean[] visited;

    static void dfs (int start) {
        visited[start] = true;
        StringBuilder sb = new StringBuilder();
        sb.append(start).append(" ");
        System.out.print(sb);

        for (int a : adjList.get(start)){
            if (!visited[a]) {
                dfs(a);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        adjList = new ArrayList<>();
        visited = new boolean[n+1];

        boolean[] visited2 = new boolean[n+1];

        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] input2 = br.readLine().split(" ");
            int x = Integer.parseInt(input2[0]);
            int y = Integer.parseInt(input2[1]);

            adjList.get(x).add(y);
            adjList.get(y).add(x);
        }

        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }

        dfs(v);


        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited2[v] = true;

        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n");
        while(!q.isEmpty()) {
            int tmp = q.poll();
            sb2.append(tmp).append(" ");
            for(int a : adjList.get(tmp)) {
                if (!visited2[a]) {
                    q.add(a);
                    visited2[a] = true;
                }
            }
        }
        System.out.print(sb2);
    }
}