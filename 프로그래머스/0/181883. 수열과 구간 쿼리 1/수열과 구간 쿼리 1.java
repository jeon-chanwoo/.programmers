class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        //queries에 있는 배열을 가지고 와서
        //arr의 인덱스 번호와 비교해서 사이의 값이면 1증가
        
        for(int i=0;i<queries.length;i++){
            for(int a=queries[i][0];a<=queries[i][1];a++)
            {
                arr[a]+=1;
            }
        }
        answer=arr;
        return answer;
    }
}