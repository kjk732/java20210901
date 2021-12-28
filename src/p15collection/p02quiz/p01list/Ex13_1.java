package p15collection.p02quiz.p01list;

import java.util.ArrayList;

public class Ex13_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lotto = new ArrayList<>();
		ArrayList<Integer> c = new ArrayList<>();

		for (int i = 0; i < 45; i++) { // 45개의 수 저장 배열

			lotto.add(i + 1); // 1~45의 수 
		}

		while (c.size() < 6) { // 6개만 뽑기
			
			int ran = (int) (Math.random() * (45 - c.size())); // 0~44 로또 인덱스에서 제거된 크기만큼 빼주기
			int x = lotto.get(ran);

			c.add(x);
			lotto.remove(ran);
		}


		for (int l : c) {
			System.out.println(l);
		}

	}

}
