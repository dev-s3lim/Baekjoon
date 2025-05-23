import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int auth = 0;

        for (int i = 0; i < 5 ; i++) {
            int n = Integer.parseInt(s[i]);
            auth += (n*n);

        }
        
        System.out.println(auth%10);

    }
}