package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public Set<Integer> toSet(int[] arr){
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0 ; i < arr.length ; i ++) {
			set.add(arr[i]);
		}
		
		return set;
		
	}
}
