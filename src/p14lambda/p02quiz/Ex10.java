package p14lambda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.SubstringMatcher;

public class Ex10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("java", "spring", "html", "a", "", "css"));
		
		// List.replaceAll
		
		list.replaceAll (i -> i.length()>=2 ? i.substring(i.length()-2) : i);
		
		System.out.println(list); // [va, ng, ml, a, , ss]
	}
}
