class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if(myString.length()<pat.length()){
            answer=0;
        }else if(myString.length()==pat.length()){
            myString=myString.toLowerCase();
            pat=pat.toLowerCase();
            if(pat.equals(myString)){
                    answer=1;
            }
        }else{
            myString=myString.toLowerCase();
            pat=pat.toLowerCase();
            for(int i=0;i<myString.length()-pat.length();i++){
                if(pat.equals(myString.substring(i,pat.length()+i))){
                    answer=1;
                    break;
                }
            }
        }
        return answer;
    }
}