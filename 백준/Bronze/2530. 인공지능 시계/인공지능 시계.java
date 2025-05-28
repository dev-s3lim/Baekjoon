import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String currentTime [] = br.readLine().split(" ");
        int hour = Integer.parseInt(currentTime[0]);
        int min = Integer.parseInt(currentTime[1]);
        int sec = Integer.parseInt(currentTime[2]);
    
        int time = Integer.parseInt(br.readLine());

        int timeHr = 0;
        int timeMin = 0;
        int timeSec = 0;

        timeSec = time % 60;
        
        timeMin = (time / 60) % 60;

        timeHr = time / 3600;
        
        int finalSec = (sec + timeSec);
        int finalHr = (hour + timeHr);
        int finalMin = (min + timeMin);
            if (finalSec >= 60){
                finalSec = finalSec % 60;
                finalMin = finalMin + 1;
            }
            if (finalMin >= 60){
                finalMin = finalMin % 60;
                finalHr = finalHr + 1;
            }
            if (finalHr >= 24){
                finalHr = finalHr % 24;
            }

        System.out.printf("%d %d %d", finalHr, finalMin , finalSec);
    }
}