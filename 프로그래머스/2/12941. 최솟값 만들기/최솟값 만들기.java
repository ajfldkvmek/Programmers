import java.util.Arrays;

class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		
	}

	public int solution(int[] A, int[] B){
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i = 0; i < A.length; i++) {
			int num = A[i]*B[A.length-1-i];
			answer += num;
		}
		return answer;
	}
}