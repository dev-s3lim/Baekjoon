import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> statusMap = new HashMap<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String status = input[1];

            statusMap.put(name, status);
        }

        List<Map.Entry<String, String>> myList = new ArrayList<>(statusMap.entrySet());
        myList.sort((a,b) -> b.getKey().compareTo(a.getKey()));

        for (Map.Entry<String, String> entry : myList) {
            if(!entry.getValue().equals("leave")) {
                System.out.println(entry.getKey());
            }
        }
    }
}