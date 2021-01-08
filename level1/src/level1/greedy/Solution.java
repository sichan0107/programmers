package level1.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		ArrayList<Integer> list = new ArrayList<>(); //reserve를 리스트화
		//{1,3,5}
		//
		for(int i : lost) {
			if(list.contains(i)) {
				list.remove(i);
			}
		}
		
		for(int i=0; i<n; i++) {
			if(lost[i])
		}
		//[1,2,3,4,5]
		/*
		 * n = 5
		 * lost = [2,4]
		 * reserve = [1,3,5]
		 * 체육수업을 들을 수 있는 학생의 최댓값 리턴
		 */
		
		
		
		return answer;
	}
	public static int[] check(int[] lost, int[] reserve) {
		List<Integer> list = new ArrayList<>(Arrays.asList(reserve));
		for(int i : lost) {
			for()
		}
	}
	
	public static void main(String[] args) {

	}

}
