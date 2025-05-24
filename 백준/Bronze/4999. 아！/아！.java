import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String h = br.readLine();

        if ((a.length() >= h.length())) {
            System.out.println("go");
        }
        else {
            System.out.println("no");
        }
    }
}
