import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        char c = 0;

        for (int i = 0 ; i < t ; i++){
            String s[] = br.readLine().split(" ");
            int r = Integer.parseInt(s[0]);
            String line = s[1];

            for (int j = 0 ; j < line.length() ; j++){
                c = line.charAt(j);
                for (int k = 0 ; k < r; k++){
                    System.out.print(c);
                }
            }
            System.out.print('\n');
        }
    }
}