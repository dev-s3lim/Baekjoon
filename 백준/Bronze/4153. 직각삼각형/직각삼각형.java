import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null){
            String input [] = line.split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            if (a==0 && b==0 && c==0) {
                break;                
            }
            else if ((a*a)==((b*b)+(c*c))||(b*b)==((a*a)+(c*c))||(c*c)==((a*a)+(b*b))){
                System.out.println("right");
            }
            else {
                System.out.println("wrong");                
            }
        }
    }
}