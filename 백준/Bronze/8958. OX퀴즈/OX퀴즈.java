import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        int point = 0;
        int streak = 0;

        for (int i = 0; i < n; i++){
            String ox = br.readLine();

            for (int j = 0; j < ox.length(); j++){
                if (ox.charAt(j) == 'O') {
                    streak++;
                    point = point + streak;
                }
                else {
                    streak = 0;
                }
            }
        System.out.println(point);
        point = 0;
        streak = 0;
        }
    }
}