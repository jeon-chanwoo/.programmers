class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int[] lnum = new int[n/k];
        for(int i=0;i<n/k;i++){
            if(k*i>n)
                break;
            else
                lnum[i]=(i+1)*k;
        }
        answer=lnum;
        return answer;
    }
}