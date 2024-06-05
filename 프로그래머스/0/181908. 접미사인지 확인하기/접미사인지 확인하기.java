class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.length()>=is_suffix.length()){
            String mstr = my_string.substring(my_string.length()-is_suffix.length());
                if(mstr.equals(is_suffix))
                    answer =1;
        }
        
        return answer;
    }
}