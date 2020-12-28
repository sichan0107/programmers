package level.sort;

import java.util.ArrayList;
/*
 * 정렬 라이브러리를 쓰지 않고도 구현해보자.
 * 여기서 하나 알아간건 Arrays.copyOfRange(원하는 배열, 시작인덱스, 마지막인덱스의 다음인덱스)
 * 이 메소드는 배열을 slice한 뒤 새로운 배열을 반환해준다... 이걸 몰랐네...;;
 */
public class K번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int a=0; a<commands.length; a++) {
        	int[] command = commands[a];
        	ArrayList<Integer> sliced = new ArrayList<Integer>();
        	for(int i=command[0]; i<command[1]+1; i++) {
        		sliced.add(array[i-1]);
        	}
        	sliced.sort(null);
        	answer[a] = sliced.get(command[2]-1);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(solution(array, commands));
	}

}
