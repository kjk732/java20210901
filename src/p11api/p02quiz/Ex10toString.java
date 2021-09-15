package p11api.p02quiz;



public class Ex10toString {

	public static void main(String[] args) {
		
		Car car1 = new Car("kia",10000);
		System.out.println(car1.toString());
		
		Car car2 = new Car("tesla",15000);
		System.out.println(car2.toString());
		
		car1.setPrice(20000);
		System.out.println(car1.toString());
	}
}
