package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex07 {

	public Map<String, String> swap(Map<String, String> param){
		//param의 size가 2
		// 두 value를 서로 바꾼 (swap)map을 만들어서 리턴
		
		Map<String, String> map = new HashMap<>();
		
		Set<String> keys = param.keySet();
		
		for(String key : keys) {
			if(key.equals("a")) {
			map.put(key, param.get("b"));
			}else {
				map.put(key, param.get("a"));
			}
		}
		
		
		
		return map;
	}
}
