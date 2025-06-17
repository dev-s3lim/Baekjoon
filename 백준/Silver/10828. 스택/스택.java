import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> myStack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            String order = input[0];

            if (order.equals("push")){
                int num = Integer.parseInt(input[1]);
                myStack.push(num);
            }
            else if (order.equals("pop")){
                if (!myStack.isEmpty()){
                    sb.append(myStack.pop()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            }
            else if (order.equals("size")){
                int cnt = myStack.size();
                sb.append(cnt).append("\n");
            }
            else if (order.equals("empty")){
                if (!myStack.isEmpty()){
                    sb.append(0).append("\n");
                }
                else{
                    sb.append(1).append("\n");
                }
            }
            else if (order.equals("top")){
                if (!myStack.isEmpty()){
                    sb.append(myStack.peek()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            } 
        }
        System.out.println(sb);
    }
}