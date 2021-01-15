package level1.hash;

import java.util.HashMap;

public class 위장 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
    
        for(int i=0; i<clothes.length; i++) {
        	map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1)+1);
        }
        
        for(int i : map.values()) {
        	answer *= i;
        }
        return answer-1;

    }
    
    
	public static void main(String[] args) {
		String[][] clothes = {
				{"yellow_hat", "headgear"},
				{"blue_sunglasses", "eyewear"},
				{"green_turban", "headgear"}};
		
		
		System.out.println(solution(clothes));
	}

}
