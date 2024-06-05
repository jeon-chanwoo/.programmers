class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int[] ranswer = new int[num_list.length+1];
        for(int i=0;i<num_list.length;i++)
            ranswer[i]=num_list[i];
        if(num_list[num_list.length-1]>num_list[num_list.length-2])
            ranswer[num_list.length]=num_list[num_list.length-1]-num_list[num_list.length-2];
        else
            ranswer[num_list.length]=num_list[num_list.length-1]*2;
        answer = ranswer;
        return answer;
    }
}