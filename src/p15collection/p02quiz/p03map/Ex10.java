package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex10 {

	public Map<String, Integer> sum(Map<String, Integer> map1, Map<String, Integer> map2) {
		// map1과 map2에 키가 둘 다 있으면 밸류를 더해서 추가
		// 한 쪽에만 있으면 그냥 추가
		// 한 새 map을 만들어서 리턴

		Map<String, Integer> sum = new HashMap<>();

		Set<String> keys1 = map1.keySet();
		for(String key : keys1) {
			sum.put(key, map1.get(key));
		}
		Set<String> keys2 = map2.keySet();
		for(String key : keys2) {
			if(sum.containsKey(key)) {
				sum.put(key, map1.get(key)+map2.get(key));
			}else {
				sum.put(key, map2.get(key));
			}
			
			
		}
		
		return sum;
	}
}