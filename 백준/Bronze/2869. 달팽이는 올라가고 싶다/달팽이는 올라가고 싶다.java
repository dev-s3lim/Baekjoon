import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        int days = (v - b) / (a - b);
        if ((v - b) % (a - b) != 0) {
            days++;
        }

        System.out.println(days);
    }
}
