package level1;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
	
	/*
	 * Arrays.stream 학습
	 * 1. 과정
	 * 	- 스트림 인스턴스 생성 -> 가공 (매핑, 필터링) -> 결과 만들기
	 * 	
	 */
	public static void main(String[] args) {
		// 배열 스트림 생성
		List<String> names = Arrays.asList("Eric", "Elena", "Java");
		
		// names.stream() 후 filter에 인자값으로 평가식을 넣음. 각 요소에 대해서 a를 포함하는 스트림만 리턴됨.
		Stream<String> stream = names.stream()
											.filter(name -> name.contains("a"))
											.map(String::toUpperCase);
		
        // month에는 오늘이 몇 월인지 들어 있습니다.
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        // switch문을 이용해서 season이 오늘은 어떤 계절인지 나타내게 만들어보세요.
        switch(month){
            case :
                
        }
        
        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
		
		
	}

}
