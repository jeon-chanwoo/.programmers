class Solution {
    public String[] solution(String[] names) {
        int count = names.length/5;
        int j=0;
        if(0 != names.length%5)
            count+=1;
        String[] answer = new String[count];
        for(int i = 0; i<names.length;i+=5){
            answer[j++]=names[i];
        }
        return answer;
    }
}