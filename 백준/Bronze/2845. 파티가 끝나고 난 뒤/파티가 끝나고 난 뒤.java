import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 [] = br.readLine().split(" ");
        String input2 = br.readLine();
        
        int area = Integer.parseInt(input1[0]);
        int people = Integer.parseInt(input1[1]);
        
        int result = area * people;
        
        for (int i = 0; i < 5 ; i++){
            String line [] = input2.split(" ");
            int news = Integer.parseInt(line[i]);
            
            System.out.println(news - result);
        }
    }
}