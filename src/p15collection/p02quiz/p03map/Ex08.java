package p15collection.p02quiz.p03map;


import java.util.Map;


public class Ex08 {
	public Map<String, String> swap(Map<String, String> param) {
		// param의 size가 2
		// 두 value를 서로 바꾼 (swap)map을 만들어서 리턴
		String temp = new String();
		temp = param.get("a");
		
		param.put("a", param.get("b"));
		param.put("b", temp);

		return param;
	}

}
