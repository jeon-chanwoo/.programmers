class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] charArr = myString.toCharArray();
        for(int i=0;i<charArr.length;i++){
            if(charArr[i]=='A')
                charArr[i]='B';
            else
                charArr[i]='A';
        }
        myString = new String(charArr);
        if(myString.contains(pat))
            answer = 1;
        return answer;
    }
}