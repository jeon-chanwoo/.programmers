class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int plen = pat.length();
        for(int i=0; i<myString.length()-plen+1;i++){
            if(pat.equals(myString.substring(i,i+plen)))
                answer++;
        }
        return answer;
    }
}