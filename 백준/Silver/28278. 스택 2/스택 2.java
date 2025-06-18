import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack <String> myStack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            String order = input[0];
            
            if (order.equals( "1")){
                String x = input[1];
                myStack.push(x);
            }
            else if (order.equals( "2")) {
                if (myStack.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(myStack.pop()).append("\n");
                }
            }
            else if (order.equals( "3")){
                sb.append(myStack.size()).append("\n");
            }
            else if (order.equals( "4")){
                if (myStack.isEmpty()){
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }
            }
            else if (order.equals( "5")){
                if (myStack.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(myStack.peek()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}