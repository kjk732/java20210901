package p15collection.p02quiz.p03map;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Ex04Test {

	@Test
	void test() {
	Ex04 e = new Ex04();
		
		Map<String, Integer> m = e.length(Arrays.asList(new String[] {"java", "spring", "apple", "jeju", "bts"}));
		
		assertEquals(5, m.size());
		assertEquals(4, m.get("java"));
		assertEquals(6, m.get("spring"));
		assertEquals(5, m.get("apple"));
		assertEquals(4, m.get("jeju"));
		assertEquals(3, m.get("bts"));
		
		
	}
}
