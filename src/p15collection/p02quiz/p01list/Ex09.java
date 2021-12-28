package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex09 {

	public void removeLastMax(List<Integer> list) {
		
		int index = 0;
		int max = list.get(0);
		
		
		
		for (int i = 1 ; i < list.size() ; i ++) {
			
			if(list.get(i) >= max) {
				max = list.get(i);
				index = i;
			}
			
		}
		list.remove(index);
	
	}
}
