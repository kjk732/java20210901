package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {

	public Map<Integer, Integer> triple(){
		//map을 만들어서 return
		// 키: 밸류 총 5개
		// 키 : 1~5
		// 밸류 : 키 *3
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(Integer a = 1 ; a < 6 ; a++) {
			map.put(a, a*3);
		}
		
		
		return map;
	}
	
	
}
