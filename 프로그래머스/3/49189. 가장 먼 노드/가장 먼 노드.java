import java.util.*;

class Solution {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    
    public int solution(int n, int[][] edge) {

        adjList = new ArrayList<>();
        visited = new boolean[n+1];

        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < edge.length; i++) {
            adjList.get(edge[i][0]).add(edge[i][1]);
            adjList.get(edge[i][1]).add(edge[i][0]);
        }
        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }

        Queue<Integer> myQueue = new LinkedList<>();
        int[] distance = new int [n+1];

        myQueue.add(1);
        visited[1] = true;
        while(!myQueue.isEmpty()){
            int tmp = myQueue.poll();
            for (int a : adjList.get(tmp)){
                if(!visited[a]) {
                    myQueue.add(a);
                    visited[a] = true;
                    distance[a] = distance[tmp] + 1;
                }
            }
        }

        int farthest = 0;
        for (int a : distance) {
            if (a > farthest) {
                farthest = a;
            }
        }

        int answer = 0;
        for (int a : distance) {
            if (a == farthest){
                answer++;
            }
        }

        return answer;
        
    }
}