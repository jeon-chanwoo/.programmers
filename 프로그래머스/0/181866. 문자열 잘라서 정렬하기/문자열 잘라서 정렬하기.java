import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer1 = myString.split("x");
        Arrays.sort(answer1);
        int index=0;
        int count=0;
        for(int i=0; i<answer1.length;i++){
            if(answer1[i].isEmpty())
                count++;
        }
        String[] answer= new String[answer1.length-count];
        for(int i=0; i<answer1.length;i++){
        if(!answer1[i].isEmpty())
                answer[index++]=answer1[i];
        }
        return answer;
    }
}