package p15collection.p02quiz.p01list;

import java.util.ArrayList;

public class Ex13 {

	public static void main(String[] args) {

		ArrayList<Integer> lotto = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			int ran = (int) ((Math.random() * 45) + 1);

			if (lotto.contains(ran))
				i--;

			else {
				lotto.add(ran);
			}
		}
		for (int l : lotto) {
			System.out.println(l);
		}

	}
}
