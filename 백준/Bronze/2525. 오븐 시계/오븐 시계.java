import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hr;
        int min;

        try (Scanner sc = new Scanner(System.in)) {
            int current_hr = sc.nextInt();
            int current_min = sc.nextInt();
            int t_min = sc.nextInt();

            hr = current_hr;
            min = current_min + t_min;
            if (min >= 60) {
                hr = current_hr + (min / 60);
                min = min % 60;
                if (hr > 23){
                    hr = hr % 24;
                }

                System.out.println(hr + " " + min);
            }
            else {
                System.out.println (hr + " " + min);
            }
        }
    }
}