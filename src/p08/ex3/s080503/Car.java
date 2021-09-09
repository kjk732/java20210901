package p08.ex3.s080503;
import s080502.*;

public class Car {

	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
			};
	void run() {
		for(Tire Tire : tires) {}
	}
}
