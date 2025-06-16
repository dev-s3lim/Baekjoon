
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> cards1 = new HashMap<>();
        Map<Integer, Integer> cards2 = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        String[] inputA = br.readLine().split(" ");

        for (int i = 0; i < n; i++){
            int numbersA = Integer.parseInt(inputA[i]);
            cards1.put(numbersA, cards1.getOrDefault(numbersA, 0)+1);
        }

        int m = Integer.parseInt(br.readLine());
        String[] inputB = br.readLine().split(" ");

        for (int i = 0; i < m; i++){
            int numbersB = Integer.parseInt(inputB[i]);
            cards2.put(numbersB, cards2.getOrDefault(numbersB, 0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++){
            int a = Integer.parseInt(inputB[i]);
            if (cards1.containsKey(a)){
                sb.append(cards1.get(a)).append(" ");
            }
            else if (cards1.get(a) == null){
                sb.append(0).append(" ");
            }
        }
        
        System.out.println(sb);
    }
}