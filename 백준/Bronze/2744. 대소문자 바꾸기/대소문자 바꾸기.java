import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);

            if (Character.isLowerCase(c)){
                char d = Character.toUpperCase(c);
                System.out.print(d);
            }
            else if (Character.isUpperCase(c)){
                char d = Character.toLowerCase(c);
                System.out.print(d);
            }
        }
    }
}