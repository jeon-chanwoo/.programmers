class Solution {
    public int[] solution(int[] arr) {
        int min=-1;
        int max=-1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                min=i;
                count++;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==2){
                max=i;
                count++;
                break;
            }
        }

        int[] answer = new int[max-min+1];
        if(count==0)
            answer[0]=-1;
        else{
            for(int i=0;i<answer.length;i++){
                answer[i]=arr[min++];
            }
        }
        return answer;
    }
}