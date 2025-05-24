import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());  // 숫자 개수
        String[] input = br.readLine().split(" ");
        int count = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(input[i]);
            boolean isPrime = true;

            if (a < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(a); j++) {
                    if (a % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println(count);
    }
}
