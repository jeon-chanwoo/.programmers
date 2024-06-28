class Solution {
    public int solution(String number) {
        int a= number.length();
        int sum=0;
        for(int i=0; i<a;i++){
            sum+=Integer.valueOf(String.valueOf(number.charAt(i)));
        }
        int answer=sum%9;
        return answer;
    }
}