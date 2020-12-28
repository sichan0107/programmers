package level.sort;

import java.util.ArrayList;
/*
 * ���� ���̺귯���� ���� �ʰ� �����غ���.
 * ���⼭ �ϳ� �˾ư��� Arrays.copyOfRange(���ϴ� �迭, �����ε���, �������ε����� �����ε���)
 * �� �޼ҵ�� �迭�� slice�� �� ���ο� �迭�� ��ȯ���ش�... �̰� ������...;;
 */
public class K��°�� {
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
