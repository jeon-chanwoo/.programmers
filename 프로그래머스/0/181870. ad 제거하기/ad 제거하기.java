class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                count++;
            }
        }
            
        String[] answer = new String[count];
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad"))
                continue;
            else {
                answer[j] = strArr[i]; 
                j++;
            }
        }
        return answer;
    }
}