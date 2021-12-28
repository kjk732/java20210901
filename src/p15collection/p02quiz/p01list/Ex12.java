package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex12 {

	public boolean mirror(List<Integer> list) {
		int m_cnt = 0; // 미러 카운트 (좌우 대칭의 갯수)

		for (int i = 0 ; i < list.size() / 2 ; i++) {

			if (list.get(i) == list.get((list.size() - 1) - i))
				m_cnt++;

		}

		return m_cnt == list.size() / 2 ? true : false;
	}
}
