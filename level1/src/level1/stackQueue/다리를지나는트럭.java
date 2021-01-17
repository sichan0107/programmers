package level1.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

class Truck{
	public int time;
	public int weight;
	
	public Truck(int time, int weight){
		this.time = time;
		this.weight = weight;
	}
}

public class 다리를지나는트럭 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int result = 0;
        int cur_weight = 0;
        Queue<Truck> trucks = new LinkedList<Truck>();
        Queue<Truck> bridge = new LinkedList<Truck>();
        
        for(int i : truck_weights) {
        	trucks.add(new Truck(0, i));
        }
        
        while(!(trucks.isEmpty() && bridge.isEmpty())) {
        	result++;
        	//건너는 트럭
        	if(!bridge.isEmpty()) {
        		if((result - bridge.peek().time) >= bridge_length) {
        			cur_weight -= bridge.peek().weight;
        			bridge.poll();
        			
        		}
        	}
        	//대기하는 트럭
        	if(!trucks.isEmpty()) {
        		if(weight >= (cur_weight + trucks.peek().weight)) {
        			cur_weight += trucks.peek().weight;        		
        			Truck t = trucks.poll(); //7456
        			t.time = result;
        			bridge.offer(t);
        		}        		
        	}
        		
        }
        
        return result;
    }

    

	public static void main(String[] args) {
		int bridge_length = 2; //100
		int weight = 10; //100
		//int [] truck_weights = {10}; //10
		
		int [] truck_weights = {7,4,5,6}; //10
		System.out.println(solution(bridge_length, weight, truck_weights));
	}

}
