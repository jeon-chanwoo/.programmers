class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean x12=false;
        boolean x34=false;
        if(x1==true || x2 ==true)
            x12=true;
        if(x3==true || x4==true)
            x34=true;
        if(x12==true && x34==true)
            answer = true;
        return answer;
    }
}