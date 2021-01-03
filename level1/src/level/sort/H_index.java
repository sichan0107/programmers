package level.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H_index {
    public static int solution(int[] citations) {
    	int answer=0;
    	if(citations[0]==0 && citations.length == 1) {
    		return answer;
    	}
    	if(citations[0] > 0 && citations.length == 1){
    		return 1;
    	}else {
        	List<Integer> cit = new ArrayList<Integer>(citations.length);
        	for(int i : citations){
        		cit.add(i);
        	}
        	// citations를 내림차순정렬
        	// 인덱스와 citations를 비교하며 citations가 인덱스볻다 작거나 같아지는 인덱스가 정답
        	cit.sort(Collections.reverseOrder());
        	System.out.println(cit.get(cit.size()-1));
        	for(int i=0; i<cit.size(); i++) {
        		if(cit.get(i) <= i) {
        			answer = i;
        			break;
        		}
        	}
    	}

    	return answer;
    }
	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		System.out.println(solution(citations));

	}

}
