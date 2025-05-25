import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a;

        while (true){
            String line = br.readLine();
            String info [] = line.split(" ");

            if ((info[0].equals("#")) && info[1].equals("0") && info[2].equals("0")){
                break;
            }

            String name = info[0];
            int age = Integer.parseInt(info[1]);
            int weight = Integer.parseInt(info[2]);

            if (age > 17 || weight >= 80){
                System.out.println(name + " Senior");
            }
            else {
                System.out.println(name + " Junior");
            }
        }
    }
}