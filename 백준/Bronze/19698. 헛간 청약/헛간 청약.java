import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int width = Integer.parseInt(input[1]);
        int length = Integer.parseInt(input[2]);
        int sizeOfCow = Integer.parseInt(input[3]);
        int maxCows = 0;


        maxCows = (width/sizeOfCow) * (length/sizeOfCow);
        
        if (n < maxCows){
            System.out.println(n);           
        }
        else{
            System.out.println(maxCows);
        }

    }
}