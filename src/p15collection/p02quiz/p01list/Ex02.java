package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		
		while(run) {
			System.out.print("0: 종료 | 1: 출력 점수(50이상) | 2: 삭제 | 3: 통계>");
			int a = sc.nextInt();
			switch (a) {
			case 3: 
				int sum = 0;
				int max = list.get(0);
				int min = list.get(0);
				
				double avg = 0;
				for(Integer n : list) {
					sum += n;
				}
				System.out.println("합: " + sum);
					
				avg = sum / (double)list.size();
				
				System.out.println("평균: " + avg);
				
				for(int j = 0 ; j < list.size() ; j ++) {
					if (max < list.get(j))
						max = list.get(j);

					if (min > list.get(j))
						min = list.get(j);
				}
				
				System.out.println("최대값: " +max);
				System.out.println("최소값: " +min);
				break;
				
			case 2: 
				if(list.size() > 0)
				list.remove(list.size()-1);
				break;
			case 1:
				for (int n : list) {
					System.out.println(n);
				}
				break;
			case 0 :
				run = false;
				System.out.println("종료합니다.");
				break;
			default:
				if(a>=50)
				list.add(a);
				break;
			}
			
			
			
			
			
		}
		
		
		
	}
}
