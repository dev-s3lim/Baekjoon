import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");

            if (input[0].equals("push_front")){
                int x = Integer.parseInt(input[1]);
                dq.addFirst(x);
            }
            else if (input[0].equals("push_back")){
                int x = Integer.parseInt(input[1]);
                dq.addLast(x);
            }
            else if (input[0].equals("pop_front")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else sb.append(dq.pollFirst()).append("\n");;
            }
            else if (input[0].equals("pop_back")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else sb.append(dq.pollLast()).append("\n");
            }
            else if (input[0].equals("size")){
                sb.append(dq.size()).append("\n");
            }
            else if (input[0].equals("empty")){
                if(dq.isEmpty()){
                    sb.append(1).append("\n");
                }
                else sb.append(0).append("\n");
            }
            else if (input[0].equals("front")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else sb.append(dq.peekFirst()).append("\n");
            }
            else if (input[0].equals("back")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else sb.append(dq.peekLast()).append("\n");
            }
        }

        System.out.println(sb);
    }
}