import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int arr [] = new int [3];
        String line = br.readLine();

        for (i = 0; i < 3; i++){
            String input [] = line.split(" ");
            int n = Integer.parseInt(input[i]);
            arr[i] = n;
        }

        Arrays.sort(arr);

        System.out.println(arr[i/2]);
    }
}