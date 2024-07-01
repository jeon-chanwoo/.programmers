class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int num=0;
        for(int i=0;i<10;i++){
            if(Math.pow(2,i)<arr.length && arr.length<=Math.pow(2,i+1)){
                num=i+1;
                break;
            }
        }
        int[] answer = new int[(int)Math.pow(2,num)];
        for(int i=0; i<arr.length;i++){
            answer[i]=arr[i];
        }
        return answer;
    }
}