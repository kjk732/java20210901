package p14lambda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
		
		System.out.println(arr1);
		
		// ArrayList.removeIf
		// 코드 작성
		
		arr1.removeIf(i -> (i%2==0));
		
		
		System.out.println(arr1); // [3, 5]
	}
}
