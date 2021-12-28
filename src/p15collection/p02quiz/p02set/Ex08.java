package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex08 {

	public Set<Integer> diff(int[] a, int[] b) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < a.length; i++) { 
			
			set.add(a[i]); // a배열 넣어주기

			for (int j = 0; j < b.length; j++) {

				if (set.contains(b[j])) { // b배열의 값중 하나라도 같은게 있으면~
					set.remove(a[i]); // 지워버리기
				}
			}
		}
		return set;
	}
}
