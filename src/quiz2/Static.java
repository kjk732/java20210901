package quiz2;

public class Static {

	public static void main(String[] args) {
		//원에 넓이를 구하는 식 완성
		// r * r* PI
		double a1 = area(10);
		System.out.println(a1);
	}
	
	public static double area(double r) {
		
		return r * r *Math.PI;
	}
}
