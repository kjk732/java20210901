package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {

	public Map<Integer, Integer> doubling(Map<Integer, Integer> param){
		
		Map<Integer, Integer> m = new HashMap<>();
		
		Set<Integer> keys = param.keySet();
	
		for (Integer key : keys) {
			m.put(key, param.get(key)*2);
		}
		return m;
	}
}
