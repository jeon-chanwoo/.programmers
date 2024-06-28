class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String m1="";
        String m2="";
        String m3="";
        for(int i=0;i<binomial.length();i++){
            if(binomial.substring(i,i+1).equals(" ")){
                m1=binomial.substring(0,i);
                m2=binomial.substring(i+1,i+2);
                m3=binomial.substring(i+3,binomial.length());
                break;
            }
        }
        int a=Integer.valueOf(m1);
        int b=Integer.valueOf(m3);
        if(m2.equals("+"))
            answer=a+b;
        else if(m2.equals("-"))
            answer=a-b;
        else if(m2.equals("*"))
            answer=a*b;
        return answer;
    }
}