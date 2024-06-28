class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int len=intervals[0][1]-intervals[0][0]+intervals[1][1]-intervals[1][0]+2;
        int[] answer = new int[len];
        int count=0;
        for(int i=0;i<len;i++){
            if(count<intervals[0][1]-intervals[0][0]+1){
                for(int j=intervals[0][0];j<=intervals[0][1];j++){
                    answer[i++]=arr[j];
                    count++;
                }
            
            }else{
                for(int j=intervals[1][0];j<=intervals[1][1];j++){
                    answer[i++-1]=arr[j];
                }
            }
            
        }
        return answer;
    }
}