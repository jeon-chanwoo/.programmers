class Solution {
    public int[] solution(int[] num_list, int n) {
        int i =0;
        int count = num_list.length/n;
        if(0 != num_list.length%n)
            count+=1;
        int[] answer = new int[count];
        for(int j =0; j<num_list.length;j=j+n)
            answer[i++]=num_list[j];
        return answer;
    }
}