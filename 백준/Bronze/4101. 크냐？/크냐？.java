import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null){
            String [] input = line.split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if (a > b) {
                System.out.println ("Yes");
            }
            else if (a==0 && b==0) {
            }
            else {
                System.out.println("No");
            }
        }
    }
}
