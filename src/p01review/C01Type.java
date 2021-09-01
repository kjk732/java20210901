package p01review;

public class C01Type {

	public static void main(String[] args) {
		
		// 데이터 타입
		// 1. 기본타입(primitive type) - 8개
		/* byte(1), short(2), int(4) , long(8)
		 * float(4), double(8)
		 * char(2)
		 * boolean(1)
		 */
		
		
		// 2. 참조타입(reference type) - 
		/* 나머지는 전부 참조타입
		 * 
		 */
		int[] arr = {3,4};
		int[] brr = arr;
		brr[0] = 33;
		System.out.println(arr[0]);
		System.out.println(brr);
	}
}
