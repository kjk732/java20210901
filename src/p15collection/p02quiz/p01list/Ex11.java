package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.List;

public class Ex11 {

	public ArrayList<Integer> minMax(List<Integer> list){
		
		ArrayList<Integer> r = new ArrayList<>();
		
		
		int max = list.get(0);
		int min = list.get(0);
		
		for (int j = 1 ; j < list.size(); j++) {
			if(min >= list.get(j)) 
				min = list.get(j);
		}
		r.add(min);
		
		for (int i = 1 ; i < list.size(); i++) {
			if(max <= list.get(i)) 
				max = list.get(i);	
		}
		r.add(max);
		
		return r;
		
	}
}
