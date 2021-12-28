package p14lambda.p02quiz;

import java.util.Arrays;
import java.util.List;

public class Ex05 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 6);
		
		// list.forEach 활용, lambda
		
		list.forEach(i -> System.out.print(i*2+" "));
		// 출력 결과
		// 6 8 10 12 
	}
}
