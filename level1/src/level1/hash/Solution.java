package level1.hash;

import java.util.HashMap;

//전화번호 목록

public class Solution {
	public static boolean solution(String[] phone_book) {
		boolean result = true;
		HashMap<String, String> map = new HashMap<>();
		

		
		return result;
	}
	
	// 효율성 탈락 케이스
	public static boolean solution2(String[] phone_book) {
		boolean result = true;
		for(int i=0; i<phone_book.length-1; i++) {
			for(int j=1; j<phone_book.length; j++) {
				//if(i == j) break;
				if(phone_book[j].startsWith(phone_book[i])) result = false;
				if(phone_book[i].startsWith(phone_book[j])) result = false;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		//String[] phone_book = {"119", "97674223", "1195524421"};
		//String[] phone_book = {"123", "456", "789"};
		String[] phone_book = {"12", "123", "1235", "567", "88"};
		
		System.out.println(solution2(phone_book));
	}

}
