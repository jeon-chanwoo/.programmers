class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();
        for(int i=0;i<myString.length();i++){
            if(arr[i]<'l')
                arr[i]='l';
        }
        String answer = new String(arr);
        return answer;
    }
}