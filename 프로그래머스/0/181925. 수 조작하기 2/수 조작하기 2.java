class Solution {
    public String solution(int[] numLog) {
        char[] ch1 = new char[numLog.length-1];
        for(int i=0; i<numLog.length-1;i++){
            switch(numLog[i+1]-numLog[i]){
                case 1 :
                    ch1[i]='w';
                    break;
                case -1 :
                    ch1[i]='s';
                    break;
                case 10 :
                    ch1[i]='d';
                    break;
                case -10 :
                    ch1[i]='a';
                    break;
            }
        }
        String answer = new String(ch1);
        return answer;
    }
}