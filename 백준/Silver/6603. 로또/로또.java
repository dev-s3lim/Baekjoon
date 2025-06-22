import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Integer> lotteryList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true){
            String line = br.readLine();

            if (line.equals("0")){
                break;
            }

            String[] input = line.split(" ");
            int k = Integer.parseInt(input[0]);
            lotteryList.clear(); //!!!리스트를 클리어해줘야 리셋되어 다음 리스트를 받을 수 있음!!!

            for(int i = 1; i <= k; i++){
                int s = Integer.parseInt(input[i]);
                lotteryList.add(s);
            }

            List<List<Integer>> answer = new ArrayList<>();
            combinations(0, new ArrayList<>(), answer);

            StringBuilder sb = new StringBuilder();

            for (List<Integer> a : answer){
                for (int n : a){
                    sb.append(n).append(" ");
                }
                sb.append("\n");
            }

            System.out.println(sb);
        }
    }

    public static void combinations (int start, List<Integer> tmp, List<List<Integer>> result){
        if (tmp.size() == 6){
            result.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = start; i < lotteryList.size(); i++){
            tmp.add(lotteryList.get(i));
            combinations(i+1, tmp, result);
            tmp.remove(tmp.size()-1);
        }
    }
}