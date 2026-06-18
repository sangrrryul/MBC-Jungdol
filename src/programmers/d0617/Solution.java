package programmers.d0617;

class Solution {
    public static void main(String[] args) {
    }
    public int[] solution(int[] arr, int n) {

        if (arr.length % 2 == 1) { // 길이가 홀수
            for (int i = 0; i < arr.length; i += 2) {
                arr[i] += n;
            }
        } else { // 길이가 짝수
            for (int i = 1; i < arr.length; i += 2) {
                arr[i] += n;
            }
        }

        return arr;
    }
}