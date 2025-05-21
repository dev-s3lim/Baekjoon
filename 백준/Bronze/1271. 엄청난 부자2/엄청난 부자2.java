import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());

        if (m.equals(BigInteger.ZERO)) {
            System.out.println("0으로는 나눌 수 없습니다.");
            return;
        }

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
