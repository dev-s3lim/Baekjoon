import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < n; i++){
            int x = Integer.parseInt(br.readLine());
            if(x > 0){
                pq.add(x);
            }
            else if (x == 0){
                if(pq.isEmpty()){
                    sb.append(0);
                    sb.append("\n");
                }
                else{
                    sb.append(pq.poll());
                    sb.append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
