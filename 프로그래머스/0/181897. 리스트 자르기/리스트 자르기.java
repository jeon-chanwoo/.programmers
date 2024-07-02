class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = new int[0]; // 초기화

        if (n == 1) {
            int b = slicer[1];
            answer = new int[b + 1];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = num_list[i];
            }
        } else if (n == 2) {
            int a = slicer[0];
            answer = new int[num_list.length - a];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = num_list[a++];
            }
        } else if (n == 3) {
            int a = slicer[0];
            int b = slicer[1];
            answer = new int[b - a + 1];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = num_list[a++];
            }
        } else if (n == 4) {
            int a = slicer[0];
            int b = slicer[1];
            int c = slicer[2];
            answer = new int[(b - a) / c + 1];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = num_list[a];
                a += c;
            }
        }

        return answer;
    }
}