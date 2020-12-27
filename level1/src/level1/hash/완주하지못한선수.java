package level1.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * 1. ArrayList를 사용한 풀이
 * 	- 시간 복잡도 면에서 Hash보다 느렸음. 테스트 케이스 5개가 평균적으로 180ms 정도
 *  - 공간은 큰 차이 없었음.
 */
public class 완주하지못한선수 {
    public static String solution(String[] participant, String[] completion) {
		String result = "";
		
		ArrayList<String> part = new ArrayList<String>(Arrays.asList(participant));
		ArrayList<String> comp = new ArrayList<String>(Arrays.asList(completion));
		
		part.sort(null);
		comp.sort(null);
		
		for(int i=0; i<comp.size(); i++) {
			if(!part.get(i).equals(comp.get(i))) {
				result = part.get(i);
				break;
			}else {
				continue;
			}
		}
		if(result == "") {
			result = part.get(part.size()-1);			
		}
		return result;
    }
    
    /*
     * 2. Hash를 사용한 풀이
     * 	- 시간 복잡도가 평균 80ms 정도
     */
    public static String solutionHash(String[] participant, String[] completion) {
		String result = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : participant) {
			if(map.get(s) == null) {
				map.put(s, 1);				
			}else {
				map.put(s, map.get(s)+1);
			}
		}
		for(String s : completion) {
			map.put(s, map.get(s)-1);
		}
		
		for(String s : map.keySet()) {
			if(map.get(s) != 0) {
				result = s;
			}
		}
		return result;
    }

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "mislav", "ana"};
		solution(participant, completion);
	}

}
