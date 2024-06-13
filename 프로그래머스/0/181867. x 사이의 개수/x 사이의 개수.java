class Solution {
    public int[] solution(String myString) {
        char[] arr = myString.toCharArray();
        int count = 1;
        int ncount=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='x')
                count++;
        }
        int[] answer = new int[count];
        for(int i = 0; i<arr.length;i++){
            
            if(arr[i] !='x')
                ncount++;
            else{
                answer[k++]=ncount;
                ncount=0;
            }
            if(i+1==arr.length)
                answer[k]=ncount;
        }
        return answer;
    }
}