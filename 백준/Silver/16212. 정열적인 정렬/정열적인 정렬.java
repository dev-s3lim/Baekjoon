import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> myList = new ArrayList<>();

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(input[i]);

            myList.add(num);
        }

        Collections.sort(myList, Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();

        for (int a : myList) {
            sb.append(a).append(" ");
        }

        System.out.println(sb);
    }
}