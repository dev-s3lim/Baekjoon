import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> filesList = new TreeMap <>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            String[] input = br.readLine().split("\\.");
            String name = input[0];
            String type = input[1];

            filesList.put(type, filesList.getOrDefault(type, 0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for (String a : filesList.keySet()){
            sb.append(a).append(" ").append(filesList.get(a)).append("\n");
        }

        System.out.println(sb);

    }
}