import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] count = new int[10001];  // 1~10000까지 저장용

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            while (count[i]-- > 0) {
                sb.append(i).append('\n');
            }
        }

        System.out.print(sb);
    }
}