package kakao;

import java.util.ArrayList;

public class 크레인인형뽑기게임 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<Integer>();
        
        for(int i=0; i<moves.length; i++) {
        	for(int j=0; j<board.length; j++) {
        		
        		if(board[j][moves[i]-1] == 0) { // 0이면 빈칸임
        			continue;
        		}else {
        			if(basket.isEmpty()) {
        				basket.add(board[j][moves[i]-1]);
        				board[j][moves[i]-1] = 0;
        				break;
        			}else {
        				//basket에 넣기 전에 현재 basket 마지막 인덱스랑 크레인이 뽑은 값이 같은지 검증
        				if(basket.get(basket.size()-1).equals(board[j][moves[i]-1])) {
        					board[j][moves[i]-1] = 0;
        					basket.remove(basket.size()-1);
        					answer = answer+2;
        				}else {
        					basket.add(board[j][moves[i]-1]);
        					board[j][moves[i]-1] = 0;
        				}
        				break;        				
        			}
        			
        		}
        	}
        	for(int a=0; a<basket.size(); a++) {
        		System.out.println(basket.get(a));
        	}
        	System.out.println("----------------------------------");
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},
						{0,0,1,0,3},
						{0,2,5,0,1},
						{4,2,4,4,2},
						{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
	}

}
