import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> myDeque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            String order = input[0];

            if (order.equals("push")){
                int num = Integer.parseInt(input[1]);
                myDeque.add(num);
            }
            else if (order.equals("pop")){
                if (!myDeque.isEmpty()){
                    sb.append(myDeque.poll()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            }
            else if (order.equals("size")){
                int cnt = myDeque.size();
                sb.append(cnt).append("\n");
            }
            else if (order.equals("empty")){
                if (!myDeque.isEmpty()){
                    sb.append(0).append("\n");
                }
                else{
                    sb.append(1).append("\n");
                }
            }
            else if (order.equals("front")){
                if (!myDeque.isEmpty()){
                    sb.append(myDeque.peek()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            }            
            else if (order.equals("back")){
                if (!myDeque.isEmpty()){
                    sb.append(myDeque.peekLast()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}