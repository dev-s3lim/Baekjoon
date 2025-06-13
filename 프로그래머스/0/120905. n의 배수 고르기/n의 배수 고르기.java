import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                myList.add(numlist[i]);
            }
        }
        int[] answer = new int [myList.size()];

        for (int i = 0; i < answer.length; i++){
            answer[i] = myList.get(i);
        }
        
        return answer;
    }
}