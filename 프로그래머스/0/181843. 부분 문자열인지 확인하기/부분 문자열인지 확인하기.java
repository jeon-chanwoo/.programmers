class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        boolean ba = my_string.contains(target);
        if(ba == true)
            answer = 1;
        return answer;
    }
}