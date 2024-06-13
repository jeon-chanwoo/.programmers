class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int Ct = 0;
        int i=0;
        for(int j=0;j<finished.length;j++){
            if(finished[j]==true)
                Ct++;
        }        
        String[] answer = new String[finished.length-Ct];
        for(int j=0;j<finished.length;j++){
            if(finished[j]==true)
                continue;
            else
                answer[i++]=todo_list[j];
        }
        return answer;
    }
}