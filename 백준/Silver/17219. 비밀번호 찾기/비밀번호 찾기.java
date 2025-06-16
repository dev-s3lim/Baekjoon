import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> userInfo = new TreeMap<>();
        String search = "";
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 0; i < n; i++){
            String[] info = br.readLine().split(" ");
            String web = info[0];
            String pw = info[1];

            userInfo.put(web, pw);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++){
            search = br.readLine();
            if (userInfo.containsKey(search)){
                String a = search;
                sb.append(userInfo.get(a)).append("\n");
            }
        }

        System.out.println(sb);
    }
}