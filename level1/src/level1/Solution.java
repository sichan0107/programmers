package level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 프린터 문제 : 우선순위 큐를 사용하는 듯?
 */
public class Solution {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        int locValue = 0;
        int[] sortedClone = priorities.clone();
        Arrays.sort(sortedClone); // 3 2 2 1
        
        //PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i : priorities) {
        	q.add(i);
        }
        
        while(!q.isEmpty()) {
        	int i = 0;
        	// 가장 앞에 있는 문서를 꺼낸다.
        	int tmp = q.poll(); // 2 1 3 2
        	if(tmp == sortedClone[i] && location == 0) {
        		answer = 1;
        		break;
        	}
        	//tmp = 2, sorted = 3, location = 2(3)
        	else if(tmp < sortedClone[i]) {
        		q.add(tmp);
        	}else if(tmp == sortedClone[i]){
        		i++;
        		answer++;
        	}
        }
       
        return answer;
    }
	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		//int[] priorities = {1,1,9,1,1,1};
		int location = 2;
		System.out.println(solution(priorities, location));
	}

}
