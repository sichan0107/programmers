package level1.hash;

import java.util.HashMap;
import java.util.Iterator;

//전화번호 목록

public class 전화번호목록 {
	// 3차시도 -> 이건 다른 사람의 풀이를 봤다... 효율성에서 도저히 패스가 안되서...
	// 생각의 전환이 필요했다. 접두어가 될 짧은 String만 생각했는데 그게 아니라 아예 긴 String에서
	// substring으로 잘라가며 연산하는 방법을 썼더라...
	
	/*
	 * 시간 복잡도를 대강 계산해보면 
	 * 1. map에 phone_book 정보를 모두 넣는데 최악의 경우 1,000,000번 수행
	 * 2. 그 다음 phone_book 배열의 값들을 순환하며, 가장 긴 번호는 20글자이므로, 20 * 1,000,000
	 * 3. 백만 + 2천만 = 최대 2100만번의 연산수행 끝에 결과 도출
	 * 4. 결론 : 1초에 1억번 연산하는 컴퓨터를 생각하면 0.3초안에는 결과가 나옴.
	 */
	public static boolean solution3(String[] phone_book) {
		boolean result = true;
		HashMap<String, String> map = new HashMap<>();
		
		for(String s : phone_book) {
			map.put(s, null);
		}	
		for(String num : phone_book) {
			for(int i=0; i<num.length(); i++) {
				if(map.containsKey(num.substring(0, i))) {
					result = false;
				}
			}
		}
		return result;
	}
	
	// 2차시도
	public static boolean solution2(String[] phone_book) {
		boolean result = true;
		HashMap<String, String> map = new HashMap<>();
		
		for(String s : phone_book) {
			map.put(s, null);
		}	
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			int count = 0;
			String key = keys.next();
			for(String s : phone_book) {
				if(key.startsWith(s)) {
					count++;
				}
				if(count > 1) result = false;
			}
		}

		return result;
	}
	
	// 효율성 탈락 케이스
	public static boolean solution(String[] phone_book) {
		boolean result = true;
		for(int i=0; i<phone_book.length-1; i++) { // 백만
			for(int j=1; j<phone_book.length; j++) { //백만
				//if(i == j) break;
				if(phone_book[j].startsWith(phone_book[i])) result = false;
				if(phone_book[i].startsWith(phone_book[j])) result = false;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		//String[] phone_book = {"119", "97674223", "1195524421"};
		String[] phone_book = {"123", "456", "789"};
		//String[] phone_book = {"12", "123", "1235", "567", "88"};
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1195524421", null);
		map.put("1425", null);
		
		if(map.containsKey("119")) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		
		//System.out.println(solution(phone_book));
	}

}
