import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int index = 1;

        for (int i = 0 ; i < 9 ; i++) {
            String s = br.readLine();
            int n = Integer.parseInt(s);

            if (n > max){
                max = n;
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);      
          
    }
}