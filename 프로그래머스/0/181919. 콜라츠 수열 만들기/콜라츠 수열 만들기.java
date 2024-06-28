class Solution {
    public int[] solution(int n) {
        int count=0;
        int nn=n;
        while(true){
            if(nn==1)
                break;
            else if(nn%2==0){
                nn/=2;
                count++;
            }else{
                nn=3*nn+1;
                count++;
            }
        }
        int[] answer = new int[count+1];
        for(int i=0;i<answer.length;i++){
            if(i==0)
                answer[i]=n;
            else{
                if(answer[i-1]%2==0)
                    answer[i]=answer[i-1]/2;
                else
                    answer[i]=3*answer[i-1]+1;
            }
                
        }
        return answer;
    }
}