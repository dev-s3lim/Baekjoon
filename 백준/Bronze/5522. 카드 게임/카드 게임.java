import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for (int i = 0 ; i < 5 ; i++){
            String input = br.readLine();
            int score = Integer.parseInt(input);
            sum += score;
        }

        System.out.println (sum);
    }
}