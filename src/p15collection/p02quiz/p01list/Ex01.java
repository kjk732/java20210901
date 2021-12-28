package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.print("l:list, e:exit, r:remove 입력>");
			String a = sc.next();
			list.add(a);
			
			if(a.equals("l")) {
				list.remove(list.size()-1);
				for( int i = 0 ; i < list.size() ;  i++) {
					System.out.println(list.get(i));
				}
			}
			if(a.equals("r")) {
				list.remove(list.size()-1);
				list.remove(list.size()-1);
				for( int i = 0 ; i < list.size() ;  i++) {
					System.out.println(list.get(i));
				}
			}
			
			if(a.equals("e")) {
				list.remove(list.size()-1);
				break;
			}
		}
		
		
	}
}
