import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> ilst= new ArrayList<>();        
        for(int i =0;i<intStrs.length;i++){
            if(k<Integer.valueOf(intStrs[i].substring(s,s+l))){
                ilst.add(Integer.valueOf(intStrs[i].substring(s,s+l)));
            }
        }
        int[] answer = new int[ilst.size()];
        for(int i =0; i<ilst.size();i++){
            answer[i]=ilst.get(i);
        }
        return answer;
    }
}