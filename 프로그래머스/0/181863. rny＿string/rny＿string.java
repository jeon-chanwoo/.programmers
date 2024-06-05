class Solution {
    public String solution(String rny_string) {
        int count = 0;
        for(int i =0; i<rny_string.length();i++){
            if(rny_string.charAt(i)=='m')
                count++;
        }
        char[] chars = new char[count*2+rny_string.length()-count];
        int i=0;
        for( int j=0; j<rny_string.length();j++){
            if(rny_string.charAt(j)=='m'){
                chars[i]='r';
                chars[i+1]='n';
                i++;
                i++;
            }else{
                chars[i]=rny_string.charAt(j);
                i++;
            }
        }
        String answer = new String(chars);
        return answer;
    }
}