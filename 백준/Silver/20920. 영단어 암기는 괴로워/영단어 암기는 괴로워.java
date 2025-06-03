import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() < m) continue; // 길이 m 미만 → 무시
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        List<String> words = new ArrayList<>(countMap.keySet());

        Collections.sort(words, (a, b) -> {
            int freqA = countMap.get(a);
            int freqB = countMap.get(b);

            if (freqA != freqB) {
                return Integer.compare(freqB, freqA); // 1. 빈도수 내림차순
            }
            if (a.length() != b.length()) {
                return Integer.compare(b.length(), a.length()); // 2. 길이 내림차순
            }
            return a.compareTo(b); // 3. 사전 오름차순
        });

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append("\n");
        }

        System.out.print(sb);
    }
}
