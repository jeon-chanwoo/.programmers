class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] stra=my_string.split("");
        while(true){
            if(s>=e)
                break;
            String temp = stra[s];
            stra[s]=stra[e];
            stra[e]=temp;
            s++;
            e--;
        }
        for(int i=0; i<stra.length;i++){
            answer+=stra[i];
        }
        return answer;
    }
}