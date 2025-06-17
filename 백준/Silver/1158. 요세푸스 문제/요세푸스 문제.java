import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> myDeque = new LinkedList<>();

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);        

        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= n; i++){
            myDeque.add(i);
        }

        sb.append("<");

        while (!myDeque.isEmpty()){
            for (int i = 0; i < k - 1; i++){
                myDeque.addLast(myDeque.poll());
            }
            sb.append(myDeque.poll());

            if (!myDeque.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append(">");

        System.out.println(sb);
    }
}