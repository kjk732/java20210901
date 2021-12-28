package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {

	public ArrayList<Integer> evenList(List<Integer> list){
	
		ArrayList<Integer> r = new ArrayList<>();
		for (int i = 0 ; i < list.size() ; i++) {
			
			if(list.get(i) % 2 == 0) {
				r.add(list.get(i));
			}
		}
		return r;
	}
	
}
