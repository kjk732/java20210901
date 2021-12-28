package p15collection.p02quiz.p01list;

public class Ex05 {

	public int sum(String str) {
		String strArr[] = str.split(" ");
		String str1 = strArr[0];
		String str2 = strArr[1];
		
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);
		
		return a+b;
	}
	
}
