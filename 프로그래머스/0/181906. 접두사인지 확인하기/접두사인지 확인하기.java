class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int pnum = is_prefix.length();
        if(pnum<my_string.length()){
        String mstr = my_string.substring(0,pnum);
            if(mstr.equals(is_prefix))
                answer = 1;
    }
        return answer;
    }
}