import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input [] = br.readLine().split(" ");

        BigInteger n = new BigInteger(input[0]);
        BigInteger m = new BigInteger(input[1]);

        if (m.equals(BigInteger.ZERO)){
            System.out.println ("0으로는 나눌 수 없습니다.");
        }
        else {
            BigInteger a = n.divide(m);
            BigInteger b = n.remainder(m);

            System.out.println(a + "\n" + b);
        }
    }
}