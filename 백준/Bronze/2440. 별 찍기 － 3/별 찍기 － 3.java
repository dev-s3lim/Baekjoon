import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 0;
        int j = 0;

        for (i = n; i > 0; i--){
            for (j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}