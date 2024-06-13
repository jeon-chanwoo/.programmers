class Solution {
    public String solution(String myString) {
        myString=myString.toLowerCase();
        char[] ch1 = myString.toCharArray();
        for(int i = 0 ; i<ch1.length;i++){
            if(ch1[i]=='a')
                ch1[i]='A';
        }
            
        String answer = new String(ch1);
        return answer;
    }
}