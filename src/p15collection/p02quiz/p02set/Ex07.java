package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex07 {

	public int countOnlyLetter(String str) {
		
		Set<Character> set = new HashSet<>();
		Set<Character> dup = new HashSet<>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (set.contains(c)) {
				dup.add(c);
			} else {
				set.add(c);
			}
		}
		
		for (Character c : dup) {
			set.remove(c);
		}
		
		return set.size();
	}
	
	
}