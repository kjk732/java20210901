package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex14LeetCode1512 {
	public int numIdenticalPairs(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<>();
		int cnt = 0;
	
		for(int i : nums) {
			if(map.containsKey(i)) {
				map.put(i , map.get(i) +1);
			}else {
				map.put(i ,1);
			}
			
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int val = entry.getValue();
			
			int sum = (val)* (val-1) /2;
			cnt +=sum;
		}
		
        return cnt;
    }
}
