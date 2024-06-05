class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = {};
        int[] lnum = new int[start-end_num+1];
        int num = start;
        for(int i=0; i<start-end_num+1;i++){
            lnum[i]=num;
            num--;
        }
        answer=lnum;
        return answer;
    }
}