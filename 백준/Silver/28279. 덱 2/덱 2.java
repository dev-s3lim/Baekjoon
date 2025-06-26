import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb =  new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            int request = Integer.parseInt(input[0]);

            if (request == 1 || request == 2){
                int x = Integer.parseInt(input[1]);
                if (request == 1){
                    dq.addFirst(x);
                }
                else if (request == 2) {
                    dq.addLast(x);
                }
            }
            else if (request == 3){
                if (!dq.isEmpty()){
                    sb.append(dq.pollFirst()).append("\n");
                }
                else sb.append(-1).append("\n");
            }
            else if (request == 4){
                if (!dq.isEmpty()){
                    sb.append(dq.pollLast()).append("\n");
                }
                else sb.append(-1).append("\n");
            }
            else if (request == 5){
                sb.append(dq.size()).append("\n");
            }
            else if (request == 6){
                if (dq.isEmpty()){
                    sb.append(1).append("\n");
                }
                else sb.append(0).append("\n");
            }
            else if (request == 7){
                if (!dq.isEmpty()){
                    sb.append(dq.peekFirst()).append("\n");
                }
                else sb.append(-1).append("\n");
            }
            else if (request == 8){
                if (!dq.isEmpty()){
                    sb.append(dq.peekLast()).append("\n");
                }
                else sb.append(-1).append("\n");
            }
        }

        System.out.println(sb);
    }
}
