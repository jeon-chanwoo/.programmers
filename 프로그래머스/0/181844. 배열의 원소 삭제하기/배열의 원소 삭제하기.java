class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<delete_list.length;j++){
                if(arr[i]==delete_list[j]){
                    count++;
                }
            }
        }
        boolean a=false;
        int i=0;
        int[] answer = new int[arr.length-count];       
        for(int j = 0;j<arr.length;j++){
            for(int k=0;k<delete_list.length;k++){
                if(arr[j]==delete_list[k]){
                    a=false;
                    break ;
                }else{
                    a=true;
                }
            }
            if(a==true){
                answer[i++]=arr[j];
                a=false;
            }  
        }
    return answer;
    }
}