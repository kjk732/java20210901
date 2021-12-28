package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex09 {

	public Map<Character, Integer> countCharacter(String str) {
		// str의 문자가 몇번 나오는지 세어서
		// 문자를 key몇번 value로 갖는 map 만들어서 return

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		return map;
	}
}
