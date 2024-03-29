package p15collection.p02quiz.p03map;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Ex07Test {

	@Test
	void test() {
	Ex07 e = new Ex07();
		
		Map<String, String> map1 = new HashMap<>();
		
		map1.put("a", "apple");
		map1.put("b", "banana");
		
		Map<String, String> map2 = e.swap(map1);
		
		assertEquals(2, map2.size());
		assertEquals("apple", map2.get("b"));
		assertEquals("banana", map2.get("a"));
		
		assertEquals(2, map1.size());
		assertEquals("apple", map1.get("a"));
		assertEquals("banana", map1.get("b"));
	}

}
