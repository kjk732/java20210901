package p14lambda.p02quiz;

import java.util.Arrays;
import java.util.List;

public class Ex12 {
	public static void main(String[] args) {
		List<Car> list = Arrays.asList(new Car("tesla", 500), new Car("kia", 300), new Car("volvo", 200), new Car("fiat", 400));
		
		
		//list.sort
		// 가격 순으로 정렬[volvo, kia, fiat, tesla]
		
		list.sort((Car c1, Car c2) -> c1.getPrice() - c2.getPrice());
		
		list.forEach(c -> System.out.println(c.getModel() + ":" + c.getPrice()));
		
		
	}
}

class Car {
	private String model;
	private int price;

	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
