import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> cards1 = new HashSet<>();
        Set<Integer> cards2 = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        String[] input1 = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            int inputA = Integer.parseInt(input1[i]);
            cards1.add(inputA);
        }

        int m = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        for(int i = 0; i < m; i++){
            int inputB = Integer.parseInt(input2[i]);
            cards2.add(inputB);
        }
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(input2[i]);
            if (cards1.contains(a)) {
                sb.append(1 + " ");
            } else {
                sb.append(0 + " ");
            }
        }
        
        System.out.println(sb);

    }
}