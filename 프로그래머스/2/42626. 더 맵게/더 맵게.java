import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int mixCount = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.offer(s);
        }

        while (pq.size() >= 2 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();
            int newFood = first + (second * 2);
            pq.offer(newFood);
            mixCount++;
        }

        if (pq.peek() < K) {
            return -1;
        }

        return mixCount;
    }
}
