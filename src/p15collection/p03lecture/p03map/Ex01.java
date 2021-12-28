package p15collection.p03lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, Integer> map;
		
		map = new HashMap<>();
		
		map.put(100, 300);
		map.put(500, 3000);
		
		
		System.out.println(map.size());
		
		Integer v1 =map.get(100);
		
		
		map.put(500, 7000);
		System.out.println(map.get(500));
		System.out.println(map.size());
		
		System.err.println("============");
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key);
		}
		
		
		System.out.println("======탐색1=======");
		keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("======탐색2=======");
		Set<Map.Entry<Integer, Integer>> entrys = map.entrySet();
		for(Map.Entry<Integer, Integer> entry : entrys) {
			
			System.out.println(entry);
		}
		
		System.out.println("====키확인====");
		boolean c1 = map.containsKey(100);
		System.out.println(c1);
		System.out.println(map.containsKey(500));
		System.out.println(map.containsKey(700));
		
	}
}
