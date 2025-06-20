import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int input = Integer.parseInt(br.readLine());
            list.add(input);
        }

        Collections.sort(list, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (int num : list){
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}