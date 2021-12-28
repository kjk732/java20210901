package p18io.p02quiz;

import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Ex07 {
	
	public Map<Character, Integer> count(String fileName) throws Exception {
		
		Reader r = new FileReader(fileName);
		
		Map<Character, Integer> map = new HashMap<>();
		int cnt = 0;
		
		while((cnt = r.read()) != -1) {
			if(map.containsKey((char) cnt)) {
				map.put((char)cnt , map.get((char)cnt) +1);
			}else {
				map.put((char) cnt, 1);
			}
		}
		r.close();
		return map;
	}
}
