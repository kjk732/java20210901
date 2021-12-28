package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;


public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String maxName = null;
		int maxScore = 0;
		int totalScore = 0;
		double avg = 0;
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			int score = entry.getValue();
			String name = entry.getKey();
			
			if(maxScore < score) {
				maxScore = score;
				maxName = name;
			}
			
			totalScore += score; 
			
		}
		avg = totalScore / (3.0);
		
		
		System.out.println(avg);
		System.out.println(maxScore);
		System.out.println(maxName);
		// 작성 위치
	}
	
}
