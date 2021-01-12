package level1.greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static int solution(int n, int[] lost, int[] reserve) {
		
		int answer = n - lost.length;
		
		Integer[] tmp = new Integer[reserve.length];
		for(int i=0; i<tmp.length; i++) {
			tmp[i] = reserve[i];
		}
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(tmp)); //reserve를 리스트화
		//{1,3,5}
		// 여벌 있는 애들중에 도난 당한 애들 컷
		for(int i : lost) {
			if(list.contains(i)) {
				list.remove(i);
			}
		}
		for(int i : list) {
			//System.out.println(i);
		}
		//lost {2,4}
		for(int i=0; i<lost.length; i++) {
			// 잃어버린 사람의 바로 앞사람이 먼저 체육복 남았는지 확인
			if(list.isEmpty()) break;
			
			if(list.contains(lost[i]-1)) {
				list.remove(list.indexOf(lost[i]-1));
				answer++;
				continue;
			}else if(list.contains(lost[i]+1)) {
				list.remove(list.indexOf(lost[i]+1));
				answer++;
				continue;					
			}else {
				continue;
			}
			
		}

		return answer;
	}

	
	public static void main(String[] args) {
		int n=5;
		int[] lost = {1,2,4,5};
		int[] reserve = {2,3,4};
		System.out.println(solution(n, lost, reserve));
	}

}
