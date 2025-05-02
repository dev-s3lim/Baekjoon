import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 빠른 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            bw.write((a + b) + "\n"); // 개행까지 포함해서 작성
        }

        bw.flush(); // 출력 버퍼 비우기 (중요!)
        bw.close();
    }
}