class Solution {
    public String solution(String my_string, String alp) {
        char[] ch = my_string.toCharArray();
        char ch1=alp.charAt(0);
        char ch2 = Character.toUpperCase(ch1);
        for(int i = 0 ; i<my_string.length();i++){
            if(ch[i]==ch1){
                ch[i]=ch2;
            }
        }
        my_string = new String(ch);
        String answer = my_string;
        return answer;
    }
}