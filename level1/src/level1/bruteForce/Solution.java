package level1.bruteForce;

import java.util.ArrayList;


public class Solution {
    public static int[] solution(int[] answers) {
        int[] result = new int[3];
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[][] pattern = {first, second, third};
        for(int i=0; i<pattern.length; i++) {
        	int tmp = check(pattern[i], answers);
        	result[i] = tmp;
        }
        int max = Math.max(Math.max(result[0], result[1]), result[2]);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max == result[0]) list.add(1);
        if(max == result[1]) list.add(2);
        if(max == result[2]) list.add(3);
        
        int[] answer = new int[list.size()];
        if(list.size() == 1) {
        	answer[0] = list.get(0);
        }else if(list.size() > 1){
        	for(int i=0; i<3; i++) {
        		answer[i] = list.get(i);
        	}        	
        }
        return answer;
    }
    public static int check(int[] person, int[] answers) {
    	int count = 0;
    	int idx = 0;
    	for(int i : answers) {
    		if(idx > person.length-1) {
    			idx = 0;
    		}
    		if(person[idx] == i) {
    			count++;
    		}
    		idx++;
    	}
    	
    	return count;
    }
	public static void main(String[] args) {
		int[] answers = {5,4,3,2,1};
        
		int[] test = solution(answers);
		for(int i : test) {
			System.out.println(i);
		}
	}

}
