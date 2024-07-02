class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[strArr.length];
        int max=0;
        for(int i=0;i< arr.length;i++){
            arr[strArr[i].length()]++;
        }
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        int answer = max;
        return answer;
    }
}