class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        int[] arr = new int[end_num-start_num+1];
        for(int i = 0;i<arr.length;i++)
            arr[i] = start_num+i;
        answer = arr;
        return answer;
    }
}