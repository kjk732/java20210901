package p15collection.p03lecture.p01list;

import java.util.ArrayList;

public class Ex02ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		//add
		
		
		arr1.add(999);
		arr1.add(888);
		
		//size
		
		System.out.println(arr1.size());
		
		arr1.add(666);
		
		System.out.println(arr1.size());
		
		
		//get
		
		System.out.println(arr1.get(0));
		
		//remove 삭제되면 인덱스가 사라지고 size가 변경됌
		
		arr1.remove(2);
		System.out.println(arr1.size());
		
		
	}
}
