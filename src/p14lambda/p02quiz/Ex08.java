package p14lambda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex08 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "java", "abc", "amond", "spring"));
		
		// List removeIf 활용
		
		
		list.removeIf(i -> !(i.substring(0,1).equals("a")));
		System.out.println(list); // [apple, abc, amond]
	}
}
